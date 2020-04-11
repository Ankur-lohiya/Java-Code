import java.util.*;
class queuelist{
	class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void enqueue(int d){
		Node n=new Node(d);
		if(tail==null){
			head=n;
			tail=n;
		}
		else{
			tail.next=n;
			tail=n;
		}
	}
	public int dequeue(){
		if(head==null) return -1;
		int t=head.data;
		head=head.next;
		return t;
	}
	public static void main(String[] args) {
		queuelist n=new queuelist();
		n.enqueue(10);
		n.enqueue(20);
		n.enqueue(30);
		n.enqueue(40);
		n.enqueue(50);
		System.out.print(n.dequeue()+" ");
		System.out.print(n.dequeue()+" ");
		System.out.print(n.dequeue()+" ");
		System.out.print(n.dequeue()+" ");
		System.out.print(n.dequeue()+" ");
		System.out.print(n.dequeue()+" ");
	}
}