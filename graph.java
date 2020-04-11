class CQGraph{
  static int V=3;    // Total number of nodes in graph
  static int adj_mat[][]=new int[V][V];
  static void read_graph(){
    int reply;
    for (int i=0;i<V;i++){
      for (int j=0;j<V;j++){
        if (i != j)  adj_mat[i][j] = 1;
        else  adj_mat[i][j] = 0;
      }
    }
  }
  static int build_graph(){
    int deg=0, i, j;
    read_graph();
    System.out.println("ADJACENCY MATRIX");
    for (i = 0; i < V; i++)  System.out.print("  "+i+" ");
    for (i = 0; i < V; i++){
      System.out.print("\n" + i + " ");
      for (j = 0; j < V; j++){
        System.out.print(adj_mat[i][j] + "   ");
        if(adj_mat[i][j] != 0) deg++;
      }
    }
    System.out.println("\n\nTotal Edges in Graph are: " + (deg/2));
    return 1;
  }
  public static void main(String args[]){
    int option;
    System.out.println("A Program to read a Simple Graph using Adjacency Matrix.");
    build_graph();
  }
}