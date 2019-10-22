package BFSGraph;

public class BFSGraph {

    public static void main(String[] args) {
            //to do code application logic here
    Graph g = new Graph(5);
    
    g.addEddge(0, 1);
    g.addEddge(0, 2);
    g.addEddge(1, 3);
    g.addEddge(2, 3);
    g.addEddge(3, 2);
    g.addEddge(3, 4);
    
        System.out.println("Following is Breath First Traversal" + " (starting from vertex 2)");
        g.BFS(0);

    }
}
