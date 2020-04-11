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
		Node prev=head;
		Node current=head;
		if(head==null){
			head=n;
			tail=n;
		}
		else{
			while(current!=null){
			if(current==head){
				if(current.data>n.data){
					n.next=current;
					head=n;
				}
				else{
					current.next=n;
					tail=n;
				}
			}
			else if(current==tail){
				if(current.data>n.data){
					n.next=current;
					head=n;
				}
				else{
					current.next=n;
					tail=n;
				}	
			}
			else{
				if(prev.data>n.data && current.data>n.data){
					prev=current;
					current=current.next;
				}
				else{
					prev.next=n;
					n.next=current;
				}
			}
		}
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
	public static void main(String args[]){
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			li.add(sc.nextInt());
			n--;
		}
		li.display();
	}
}