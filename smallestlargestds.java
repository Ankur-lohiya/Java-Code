import java.util.Scanner;
class smallestlargestds{
  class Node{
  int data;
  Node next;
  Node(int d){
    data=d;
  }
}
 Node insertEnd(Node head, int data){
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   
    if (head == null){
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }

  void forwardPrint(Node head){
    Node current = head; // start at beginning of list
    while(current != null){
      System.out.print(current.data + " "); // print data
      current = current.next; // move to next link
    }
  }
  Node shiftSmallLarge(Node org){
  Node cur=org,head=null,tail=null,max1=null,min1=null;
  int min=9999,max=-999;
  while(cur!=null){
   if(cur.data<min) min=cur.data;
   if(cur.data>max) max=cur.data;
    cur=cur.next;
  }
  while(org!=null){
    Node n=new Node(org.data);
    if(org.data==min){
      min1=n;
      org=org.next;
    }
    else if(org.data==max){
      max1=n;
      org=org.next;
    }
    else{
    if(head==null){
      head=n;
      tail=n;
    }
    else{
      tail.next=n;
      tail=n;
    }
    }
    org=org.next;
  }
  tail.next=max1;
  tail=max1;
  min1.next=head;
  head=min1;
  return head;
}
public void main(String[] args){
    int t,n,m;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine());
    while(t>0){
      Node head = null;
      n=Integer.parseInt(s.nextLine());
      while(n>0){
        m=Integer.parseInt(s.nextLine());
        head = insertEnd(head, m);
        n--;
      }
      head = shiftSmallLarge(head);
      forwardPrint(head);
      System.out.print("\n");
      t--;
    }
  }
}