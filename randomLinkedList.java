import java.util.*;
class test{
	public static void main(String[] args) {
			Node root;
			
			// Putting values
			root=new Node(7);
			root.next=new Node(13);
			root.next.next=new Node(11);
			root.next.next.next=new Node(10);
			root.next.next.next.next=new Node(1);

			// Random scene
			root.random=null;
			root.next.random=root;
			root.next.next.random=root.next.next.next.next;
			root.next.next.next.random=root.next.next;
			root.next.next.next.next.random=root;
			Node res=copyRandomList(root);
			while(res!=null) {
				if(res.random!=null) System.out.println(res.random.val);
				else System.out.println("Null");
				res=res.next;
			}
	}

	static Node copyRandomList(Node head) {
        if(head==null || head.next==null) return head;
         Node head1=null,cur=null,cur1=head,cur2=head.next;
        while(cur1!=null){
            Node n=new Node(cur1.val);
            if(cur==null){
                cur=n;
                head1=cur;
            }
            else{
                cur.next=n;
                cur=cur.next;
            }
            cur1.next=cur;
            cur.random=cur1;
            cur1=cur2;
            if(cur2!=null){
                cur2=cur2.next;
            }
        }
        cur=head1;
        while(cur!=null){
        	if(cur.random.random==null) cur.random=null;
        	else cur.random=cur.random.random.next;
            cur=cur.next;
        }
        return head1;
}
}

// Node implemenataion
class Node{
int val;
Node next,random;
	Node(){}
	Node(int d){
	val=d;
	next=null;
	random=null;
	}
}