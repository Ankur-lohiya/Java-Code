class graphlinklist{
  class CQGraph{
  int vertex;
  CQGraph next;
}
   int V = 3;    // Total number of nodes in graph
   void read_graph(CQGraph adj_list[]){
    int i, j;
    int reply;
    CQGraph p, c;
    for (i = 0; i < V; i++) {
      for (j = 0; j < V; j++) {
        if (i != j){
          c = new CQGraph();
          c.vertex = j;
          c.next = null;
          if(adj_list[i] == null) adj_list[i] = c;
          else{
            p = adj_list[i];
            while(p.next != null) p = p.next;
            p.next = c;
          }
        }
      }
    }
  }
   int build_graph(){
    CQGraph adj_list[]=new CQGraph[V], p=null;
    int deg=0, i, j;
    for(i = 1; i < V; i++) adj_list[i] = null;
    read_graph(adj_list);
    System.out.print("\n Vertex \t Adjacent to ");
    for(i = 0; i < V; i++ ){
      p = adj_list[i];
      System.out.print("\n \t"+i+"\t \t ");
      while(p != null){
        deg++;
        System.out.print(p.vertex + ", ");
        p = p.next;
      }
      System.out.println();
    }
    System.out.println("\n\nTotal Edges in Graph are: " + (deg/2));
    return 1;
  }
  public  void main(String ab[]){
    System.out.println("\n A Program to read a Simple Graph using Adjacency List.");
    build_graph();
  }
}