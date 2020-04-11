import java.util.Scanner;
class Main{
  static Node insertEnd(Node head, int data){
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;
    if (head == null){
      head = newLink;
      return head;
    }
    while (last.next != null) last = last.next;
    last.next = newLink;
    return head;
  }
  static void forwardPrint(Node head){
    Node current = head;
    while(current != null){
      System.out.print(current.data + " ");
      current = current.next;
    }
  }
  static Node findUnion(Node head1, Node head2){
      if(head1==null && head2==null) return head1;
      else if(head1==null && head2!=null) return head2;
      else if(head2==null && head1!=null) return head1;
      else{
        Node cur=head1;
        while(head2!=null){
          Node n=new Node(head2.data);
          if(head1.data>head2.data){
            n.next=cur;
            cur=n;
            head1=cur;
          }
          else if(head1.next==null && head1.data<head2.data) head1.next=n;
          else{
            Node c=head1;
            int flag=0;
              while(c.next!=null){
                if(c.data<=head2.data && head2.data<=c.next.data){
                  n.next=c.next;
                  c.next=n;
                  flag=1;
                  break;
                }
                else c=c.next; 
              }
              if(flag==0){
                c.next=n;
              }
          head1=head1.next;
          }
          head2=head2.next;
        }
      return cur;
      }
  }
  public static void main(String[] args){
    int t,n,m,x;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0){
      Node head = null, head2=null, t1;
      n=Integer.parseInt(s.nextLine());
      while(n>0){
        m=Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      n=Integer.parseInt(s.nextLine());
      while(n>0){
        m=Integer.parseInt(s.nextLine());
        head2 = insertEnd(head2, m);
        n--;
      }
      t1 = findUnion(head, head2);
      forwardPrint(t1);
      System.out.println();
      t--;
    }
  }
}
class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
  }
}