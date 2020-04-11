import java.util.Scanner;
class Main{
  static LinkList insertEnd(LinkList head, int data){
    LinkList newLink = new LinkList(data);
    LinkList last = head;
    newLink.next = null;   
    if (head == null){
      head = newLink;
      newLink.prev = null;
      return head;
    }
    while (last.next != null) last = last.next;
    last.next = newLink;  
    newLink.prev = last;
    return head;
  }

  static void traverse(LinkList first){
    while (first != null){
      System.out.print(first.data + " ");
      first = first.next;
    }
  }
  static LinkList rotateByK(LinkList head, int k){
    if(head==null) return null;
    else if(head!=null && head.next==null) return head;
    while(k!=0){
      LinkList cur=head;
      while(cur.next!=null)cur=cur.next;
      cur.prev.next=null;
      cur.prev=null;
      cur.next=head;
      head.prev=cur;
      head=cur;
      k--;
    }
    return head;
  }
  public static void main(String[] args){
    int t,n,m,x,y;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0){
      LinkList head = null, t1, t2;
      n=Integer.parseInt(s.nextLine().trim());
      while(n>0){
        m=Integer.parseInt(s.nextLine().trim());
        head = insertEnd(head, m);
        n--;
      }
      x=Integer.parseInt(s.nextLine().trim());
      t1 = rotateByK(head, x);
      traverse(t1);
      System.out.println();
      t--;
    }
  }
}
class LinkList{
  int data;
  LinkList next;
  LinkList prev;
  LinkList(int d){
    data=d;
  }
}