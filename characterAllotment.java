import java.util.*;
class ListNode{
	class Node{
		int n;
		char ch1,ch2;
		Node next,prev;
		public Node(int n){
			this.n=n;
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
	public void checkLucky(){
		int flag=0;
		while(head!=null){
			if(head.ch1==head.ch2){
				flag=1;
				System.out.print(head.n+" ");
			}
			head=head.next;
		}
		if(flag==0) System.out.println("-1");
	}
	public void setString(String a){
		Node tail=head;
		int i=0;
		while(tail!=null){
			tail.ch1=a.charAt(i);
			if(i==a.length()-1) i=0;
			else i++;
			if(tail.next==null) break;
			tail=tail.next;
		}
		while(tail!=null){
			tail.ch2=a.charAt(i);
			if(i==a.length()-1) i=0;
			else i++;
			tail=tail.prev;
		}
	}
	public static void main(String args[]){
		ListNode li=new ListNode();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt(),i=1;
		while(i<=n){
			li.add(i);
			i++;
		}
		li.setString(s);
		li.checkLucky();
	}
}