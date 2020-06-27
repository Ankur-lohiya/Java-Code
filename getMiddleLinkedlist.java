import java.util.*;
class LinkedList{
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
	}
	static public Node head=null;
	static public Node tail=null;
	static public void add(int d){
		Node n=new Node(d);
		if(head==null){
			head=n;
			tail=n;
		}
		else{
			tail.next=n;
			tail=n;
		}
	}
	static public int middleDisplay(Node head){
		if(head==null) return -1;
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	public static void main(String args[]){
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) li.add(sc.nextInt());
		System.out.println(li.middleDisplay(head));
	}
}