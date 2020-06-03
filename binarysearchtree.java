import java.util.*;
class binarysearchtree{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	static Node head=null;
	public static Node insert(Node root,int key){
		if(root==null){
			Node n=new Node(key); 
			return n;
		}
		else{
			if(key<root.data) root.left=insert(root.left,key);
			else root.right=insert(root.right,key);
			return root;
		}
	}
	public static void print(Node root){
		if(root!=null){
			print(root.left);
			System.out.print(root.data+" ");
			print(root.right);
		}
	}	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0){
			head=insert(head,sc.nextInt());
			n--;
		}
		print(head);
	}
}