
package BFSGraph;

import java.io.*;
import java.util.*;

public class Graph {
    private int V; //No.of vertices
    private LinkedList<Integer> adj[]; //adjacency lists
    
    //constractor
    Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    
    //function to add an edge into the graph
    void addEddge(int v, int w){
        adj[v].add(w);
    }
    
    //print BFS traversal from a given source s
    void BFS (int s){
        //mark all the vertices as not visited (by default)
        //set as false
        boolean visited[] = new boolean[V];
        
        //create a qqueue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        //mark the current node as visited and enqueue it
        visited[s]= true;
        queue.add(s);
        
        while(queue.size() !=0){
            
            //dequeue a vertex from queue and print it
            s=queue.poll();
            System.out.println(s +" ");
            
            //get all adjacent vertices of the dequeued vertex s
            //if a adjacent has not been visited,then mark it
            //visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
