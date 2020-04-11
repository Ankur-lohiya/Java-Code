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
      int data=s.nextInt();
      t1 = Result.insertSorted(head,data);
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
  static LinkList insertSorted(LinkList head,int a){
    LinkList n=new LinkList(a);
    if(head==null) return null;
    else if(head!=null && head.next==null){
      if(head.data>a){
        n.next=head;
        head.prev=n;
        head=n;
      }
      else{
        head.next=n;
        n.prev=head;
      }
    }
    else{
      if(head.data>=a){
        n.next=head;
        head.prev=n;
        head=n;
      }
      else{
        LinkList cur=head;
        int flag=0;
        while(cur.next!=null){
          if(cur.data<a && cur.next.data>=a){
            cur.next.prev=n;
            n.next=cur.next;
            cur.next=n;
            n.prev=cur;
            flag=1;
          }
          cur=cur.next;
        }
        if(flag==0 && cur.next==null){
          cur.next=n;
          n.prev=cur;
        }
      }
    }
    return head;
  }
}