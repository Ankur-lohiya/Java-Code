import java.util.*;
class countleaves{
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
	static int countLeafs(Node root){
		if(root==null) return 0;
		else{
			int count=0,i=0,k=0;
			Node a[]=new Node[100];
			while(root!=null){
				if(root.leftChild==null && root.rightChild==null){
					count++;
					root=a[i++];	
				} 
				else{
					if(root.leftChild!=null) {
						a[k++]=root.leftChild;
						if(root.rightChild==null) root=a[i++];
					}
					if(root.rightChild!=null) {
						a[k++]=root.rightChild;
						root=a[i++];
					}
				}
			}
			return count;
		}
	}
	static void preOrder(Node root){
    if (root != null){
      System.out.print(root.data + " ");
      preOrder(root.leftChild);
      preOrder(root.rightChild);
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
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n, i;
    n = s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
      a[i] = s.nextInt();
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    System.out.print(countLeafs(root));
  }
}