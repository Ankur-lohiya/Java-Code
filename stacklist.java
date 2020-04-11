import java.util.*;
class stacklist{
	class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
	}
	Node head=null;
	public void push(int d){
		Node n=new Node(d);
		if(head==null){
			head=n;
		}
		else{
			n.next=head;
			head=n;
		}
	}
	public int pop(){
		if(head==null) return -1;
		int t=head.data;
		head=head.next;
		return t;
	}
	public static void main(String[] args) {
		stacklist n=new stacklist();
		n.push(10);
		n.push(20);
		n.push(30);
		n.push(40);
		n.push(50);
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
		System.out.print(n.pop()+" ");
	}
}