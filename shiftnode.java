import java.util.*;
class ListNode{
	class Node{
		int n;
		char ch;
		Node next;
		public Node(int n){
			this.n=n;
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
		}
	}
	public void display(){
		Node current=head;
		while(current!=null){
			System.out.println(current.n);
			current=current.next;
		}
	}
	public void setString(String a){
		Node tail=head;
		for(int i=0;i<a.length();i++){
			tail.ch=a.charAt(i);
			// System.out.println(tail.n+" "+a.charAt(i));
			if(i!=a.length()-1)tail=tail.next;
			if(tail==null)tail=head;
		}
		if(tail.next!=null) tail.next=tail.next.next;
		else head=head.next;
	}
	public static void main(String args[]){
		ListNode li=new ListNode();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i=1;
		while(i<=n){
			li.add(i);
			i++;
		}
		int t=sc.nextInt();
		while(t!=0){
			String s=sc.next();
			// System.out.println(s);
			li.setString(s);
			t--;
		}
		li.display();
	}
}