import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

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
    public void BFS(int startNode){
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        System.out.print("BFS traversal starting from node "+ startNode+":");

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            System.out.print(currentNode+" ");

            for(int neighbor:adj[currentNode]){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Custom_Graph g = new Custom_Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(1,2);
        g.printGraph();

        g.BFS(0);
    }
}
