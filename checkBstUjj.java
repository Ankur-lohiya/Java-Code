import java.util.Arrays;
class Binary_tree{

static int a[]=new int[100];
static int i=0;
  
  public static void main(String[] args)
  {
    Node root;
      root=new Node(10);
      root.l=new Node(8);
      root.r=new Node(12);
      root.l.l=new Node(7);
      root.l.r=new Node(11);

      
      System.out.println();
      System.out.println("InOrder");
      InOrder(root);
      // To check whether the array is in ascending order or not:
      System.out.println(check()); 
  }

  static boolean check(){
    for(int j=0;j<i-1;j++){
        if(a[j+1]>a[j]) continue;
        else return false;
      }
      return true;
  }

  

  static void InOrder(Node curr){
    
    if(curr==null) return;
    
    InOrder(curr.l);
    a[i++]=curr.data;
    InOrder(curr.r);
    return;
    
  }

    

}



// class Binary_tree{

// static int max=Integer.MIN_VALUE;
  
//   public static void main(String[] args)
//   {
//     Node root;
//       root=new Node(10);
//       root.l=new Node(8);
//       root.r=new Node(12);
//       root.l.l=new Node(7);
//       root.l.r=new Node(11);

      
    
//       System.out.println("InOrder");
      
      
//       System.out.println(InOrder(root)); 
//   }

  

  

//   static boolean InOrder(Node curr){
    
//     if(curr==null) return true;
    
//     InOrder(curr.l);
//     if(max>curr.data) return false;
//     else max=curr.data;
//     InOrder(curr.r);
//     return true;
    
//   }

    

// }

// // Node implemenataion
// class Node{
//   int data;
//   Node l,r;
//   Node(){}
//   Node(int d)
//   {
//     data=d;
//     l=null;
//     r=null;
//   }
// }


// // Node implemenataion
// class Node{
//   int data;
//   Node l,r;
//   Node(){}
//   Node(int d)
//   {
//     data=d;
//     l=null;
//     r=null;
//   }
// }
