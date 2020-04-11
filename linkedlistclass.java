import java.util.*;
class LinkedList{
	class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
			next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void add(int d){
		Node n=new Node(d);
		if(head==null){
			head=n;
			tail=n;
		}
		else{
			tail.next=n;
			tail=n;
			//n.next=head;
			//head=n;
		}
	}
	public void deletelast(){
		Node current=head;
		while(current!=null){
		if(current.next==tail){
			current.next=null;
			tail=current;
		}
		current=current.next;
	}
	}
	public void deletefirst(){
		head=head.next;
	}
	public void deleteposition(int n){
		Node current=head;
		int i=1;
		while(i<n){
			if(i==n-1){
				current.next=current.next.next;
			}
			current=current.next;
			i++;
		}
	}
	public void display(){
		Node current=head;
		System.out.println(head.data); 
		if(current==null) System.out.println("LIST EMPTY");
		else{
			while(current!=null){
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}
	public static void main(String args[]){
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			li.add(sc.nextInt());
			n--;
		}
		//li.deletelast();
		//li.deletefirst();
		li.deleteposition(sc.nextInt());
		li.display();
	}
}