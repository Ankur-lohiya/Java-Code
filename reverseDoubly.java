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
  public static void main(String[] args){
    int t,n,m,x,y;
    Scanner s = new Scanner(System.in);
    t = s.nextInt();
    while(t>0){
      LinkList head = null, t1, t2;
      n = s.nextInt();
      while(n>0){
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      t1 = Result.reverse(head);
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
class Result {
  static LinkList reverse(LinkList head){
    if(head==null) return null;
    else if(head!=null && head.next==null) return head;
    else{
      LinkList cur=head,c=null;
      while(head!=null){
        c=head.prev;
        head.prev=head.next;
        head.next=c;
        head=head.prev;
      }
      if(c!=null){
        cur=c.prev;
      }
    return cur;
    }
  }
}