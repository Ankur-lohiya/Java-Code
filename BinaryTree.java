class BinaryTree{
	class Node{
		int data;
		Node left,right;
		public Node(int item){
			data=item;
			left=right=null;
		}
	}
	Node root;
	BinaryTree(int data){
		root=new Node(data);
	}
	BinaryTree(){
		root=null;
	}
	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
	}
}