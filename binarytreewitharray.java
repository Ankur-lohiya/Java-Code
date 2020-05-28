import java.util.*;
class  binarytreewitharray{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	public static void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	public static Node buildTree(int t[],int number){
		Node head=null,n1=null;
		Node a[]=new Node[number+1];
		int k=1;
		for(int i=0;i<number;){
			Node n=new Node(t[i]);
			if(head==null){
				head=n;
				n1=n;
			}
			else{
				if(n1.left==null) n1.left=n;
				else if(n1.right==null) {
					n1.right=n;
					n1=a[k++];
				} 
			}
			a[i++]=n;
		}
		return head;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		Node head=buildTree(a,n);
		inorder(head);
	}
}