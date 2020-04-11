import java.util.*;
class CircularLinkedList{
	public Node head=null;
	public Node tail=null;
	class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
	}
	public void add(int d){
		Node n=new Node(d);
		if(head==null){
			head=n;
			tail=n;
		}
		else{
			tail.next=n;
			tail=n;
			tail.next=head;
		}
	}
	public void display(){
		Node current=head;
			do{
				System.out.print(current.data+" ");
				current=current.next;
			}while(current!=tail.next);
	}
	public static void main(String args[]){
		CircularLinkedList li=new CircularLinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			li.add(sc.nextInt());
			n--;
		}
		li.display();
	}
}