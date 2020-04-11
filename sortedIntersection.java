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
        sortList(head1);
        sortList(head2);
        Node newList=null;
        while(head1!=null){
          Node c=head2;
          while(c!=null){
            if(head1.data==c.data){
              Node n=new Node(head1.data);
              if(newList==null) newList=n;
              else {
                n.next=newList;
                newList=n;
              }
            }
            c=c.next;
          }
          head1=head1.next;
        }
        sortList(newList);
        return newList;
      }
  }
  static void sortList(Node head){
    Node cur=null,cur1=head;
    while(head!=null){
      cur=head.next;
      while(cur!=null){
        if(head.data>cur.data){
          int t=head.data;
          head.data=cur.data;
          cur.data=t;
        }
        cur=cur.next;
      }
      head=head.next;
    }
    while(cur1.next!=null){
      if(cur1.data==cur1.next.data){
        cur1.next=cur1.next.next;
      }
      else cur1=cur1.next;
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