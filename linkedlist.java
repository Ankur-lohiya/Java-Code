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
	public void display(){
		Node current=head;
		if(current==null) System.out.println("LIST EMPTY");
		else{
			while(current!=null){
				System.out.print(current.data+" ");
				current=current.next;
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
				c=current.next;
				current.next=n1;
				n1.next=c;
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