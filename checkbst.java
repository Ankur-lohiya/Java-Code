import java.util.*;
class checkbst{
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	static void inOrder(Node root){
    if (root != null){
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }
  }
  static Node insertLevelOrder(int arr[], Node root, int i, int n){
    if (i < n){
      Node temp = new Node(arr[i]);
      root = temp;
      root.left = insertLevelOrder(arr, root.left, 2 * i + 1, n);
      root.right = insertLevelOrder(arr, root.right, 2 * i + 2, n);
    }
    return root;
  }
  static int a[]=new int[100],i=0;
  static int isBinarySearchTree(Node head){
  	int t=0;
  	if(head!=null){
  		a[i]=head.data;
  		int p=((i-1)/2)/2;
  		if(head.left==null && head.right==null) t=1;
  		else{
  			if(head.left!=null && ((p>=0 && head.left.data<a[p]) || head.left.data<head.data)) {
  				if(head.right==null){
  				 	return isBinarySearchTree(head.left);
  				 }
  				else if(head.right!=null && ((p>=0 && head.right.data>a[p]) || head.right.data>head.data)){
  					if(isBinarySearchTree(head.left)==1 && isBinarySearchTree(head.right)==1) t=1;
  					else t=0;
  				}
  				else t=0;
  			}
  			else t=0;
  		}
  	}
  	i++;
  	return t;
  }
  static Node buildTree(int t[], int n){
    Node node = null;
    node = insertLevelOrder(t, node, 0, n);
    return node;
  }
  public static void main(String[] args){
    int a[]=new int[10];
    int n, m, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine());
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    System.out.print(isBinarySearchTree(root));
  }
}