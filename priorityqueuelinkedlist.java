import java.util.*;
class priorityqueuelinkedlist{
	static class Node{
		int data;
		int priority;
		Node next;
		Node(int d,int p){
			data=d;
			priority=p;
			next=null;
		}
	}
	static Node head=null,tail=null;
	public static void insert(int data,int p){
		Node n=new Node(data,p);
		if(head==null){
			head=n;
			tail=n;
		}
		else{
			Node cur=head;
			if(cur.priority>n.priority){
				n.next=head;
				head=n;
			}
			else if(tail.priority<n.priority){
				tail.next=n;
				tail=n;
			}
			else{
				while(cur.next!=null){
				if(cur.priority<n.priority && cur.next.priority>n.priority){
					n.next=cur.next;
					cur.next=n;
					break;
				}
				cur=cur.next;
				}
			}
		}
	}
	public static int delete(){
		int a=head.data;
		head=head.next;
		return a;
	}
	public static void print(){
		Node cur=head;
		while(cur!=null){
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// while(n!=0){
		// 	insert(sc.nextInt(),sc.nextInt());
		// 	n--;
		// }
		insert(10,1);
		insert(20,2);
		insert(40,5);
		System.out.print(delete()+" ");
		insert(30,3);
		insert(70,1);
		System.out.print(delete()+" ");
		System.out.println(delete()+" ");
		print();
	}
}