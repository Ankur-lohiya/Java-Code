import java.util.*;
class LinkedList{
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int d){
			data=d;
			next=null;
			prev=null;
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
			n.prev=tail;
			tail=n;
		}
	}
	public void display(){
		Node current=tail;
		if(current==null) System.out.println("LIST EMPTY");
		else{
			while(current!=null){
				System.out.print(current.data+" ");
				current=current.prev;
			}
		}
	}
	public void insert(int n,int a){
		int i=1;
		Node n1=new Node(n);
		Node current=head;
		Node c;
		while(i<a){
			if(i==a-1){
				n1.next=current.next;
				current.next.prev=n1;
				current.next=n1;
				n1.prev=current;
			}
			current=current.next;
			i++;
			if(current==null){ System.out.println("position not found"); break;}		
		}
	}
	public static void main(String args[]){
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		int n=sc.nextInt();
		int a=sc.nextInt();
		li.insert(n,a);
		li.display();
	}
}