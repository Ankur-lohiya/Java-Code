import java.util.*;
class levelorder{
	static class Node{
		int data;
		Node leftChild;
		Node rightChild;
		Node(int d){
			data=d;
			rightChild=null;
			leftChild=null;
		}
	}
	static void inOrder(Node root){
    if (root != null){
      inOrder(root.leftChild);
      System.out.print(root.data + " ");
      inOrder(root.rightChild);
    }
  }
  static Node insertLevelOrder(int arr[], Node root, int i, int n){
    if (i < n){
      Node temp = new Node(arr[i]);
      root = temp;
      root.leftChild = insertLevelOrder(arr, root.leftChild, 2 * i + 1, n);
      root.rightChild = insertLevelOrder(arr, root.rightChild, 2 * i + 2, n);
    }
    return root;
  }
  static Node buildTree(int t[], int n){
    Node node = null;
    node = insertLevelOrder(t, node, 0, n);
    return node;
  }
  static void printLevelWise(Node head){
  	if(head==null) System.out.println();
  	else{
  		Node a[]=new Node[100];
  		int i=0,j=0;
  		while(head!=null){
  			System.out.print(head.data+" ");
  			a[i++]=head.leftChild;
  			a[i++]=head.rightChild;
  			head=a[j++];
  		}
  	}
  }
  public static void main(String[] args){
    int a[]=new int[10];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = s.nextInt();
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    printLevelWise(root);
  }
}