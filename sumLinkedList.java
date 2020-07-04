import java.util.*;
class Main {
  static Node insertEnd(Node head, int data) {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }

  static void forwardPrint(Node head)   {
    Node current = head; // start at beginning of list
    while(current != null) // until end of list,
    {
      System.out.print(current.data + " "); // print data
      current = current.next; // move to next link
    }
  }

  public static void main(String[] args) {
    int t,n,m,x;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0) {
      Node head = null, head2=null, t1;
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head2 = insertEnd(head2, m);
        n--;
      }
      t1 = Result.addListNumbers(head, head2);
      forwardPrint(t1);
      System.out.println();
      t--;
    }
  }
}
class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
}
class Result {
  static Node addListNumbers(Node first, Node second) {
     Node res = null; 
        Node prev = null; 
        Node temp = null; 
        int carry = 0, sum; 
        while (first != null || second != null){ 
            sum = carry + (first != null ? first.data : 0)+(second != null ? second.data : 0);
            carry = (sum >= 10) ? 1 : 0; 
            sum = sum % 10; 
            temp = new Node(sum); 
            if (res == null) { 
                res = temp; 
            }
            else{ 
                prev.next = temp; 
            } 
        prev = temp; 
            if (first != null) { 
                first = first.next; 
            } 
            if (second != null) { 
                second = second.next; 
            } 
        } 
        if (carry > 0) { 
            temp.next = new Node(carry); 
        } 
      return res; 
    } 
  }
