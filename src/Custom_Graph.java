import java.util.ArrayList;

public class Custom_Graph {
    private int V;
    private ArrayList<Integer>[] adj;

    public Custom_Graph(int V){
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }
    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    public void printGraph(){
        for (int i = 0; i < V; i++) {
            System.out.print(i+"->");
            for(int neighbor:adj[i]){
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Custom_Graph g = new Custom_Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.printGraph();
    }
}
