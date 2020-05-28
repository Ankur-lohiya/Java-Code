import java.util.Scanner;
class trees{
  static void inOrder(Node root){
    if (root != null)    {
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
  static void printLevelWise(Node root){
  if(root==null) System.out.print("");
    else{
      Node a[]=new Node[100];
      int j=0,top=0;
      while(root!=null){
        if(j==0 && top==0) System.out.println(root.data);
        else if(j==2 && top==4) System.out.println(root.data);
        else System.out.print(root.data+" ");
        if(root.leftChild!=null) a[top++]=root.leftChild;  
        if(root.rightChild!=null) a[top++]=root.rightChild;
        root=a[j++];
      }
    }
}
public static void main(String[] args){
    int a[]=new int[10];
    int n, i;
    Scanner s=new Scanner(System.in);
    n = Integer.parseInt(s.nextLine());
    for(i=0;i<n;i++)
      a[i] = Integer.parseInt(s.nextLine());
    Node root = null;
    if(n!=0)
      root = buildTree(a, n);
    printLevelWise(root);
  }
}
class Node
{
  int data; // data used as key value
  Node leftChild;
  Node rightChild;
  public Node()
  {
    data=0;
  }
  public Node(int d)
  {
    data=d;
  }
}