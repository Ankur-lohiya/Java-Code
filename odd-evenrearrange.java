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
  static LinkList rearrangeList(LinkList head){
    LinkList head1=null,head2=null,cur=null,cur1=null;
    int i=1;
    if(head==null)return null;
    else if(head!=null && head.next==null) return head;
    while(head!=null){
      LinkList n=new LinkList(head.data);
      if(i%2!=0){
        if(head1==null){
          head1=n;
          cur1=head1;
        }
        else {
          head1.next=n;
          head1=n;
        }
      }
      else{
        if(head2==null){
          head2=n;
          cur=head2;
        }
        else {
          head2.next=n;
          head2=n;
        }
      }
      head=head.next;
      i++;
    }
    head2.next=cur1;
    return cur;
  }
  public static void main(String[] args){
    int t,n,m,x,y;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0){
      LinkList head = null, t1, t2;
      n=Integer.parseInt(s.nextLine());
      while(n>0){
        m=Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      t1 = rearrangeList(head);
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