/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirstsearch;

import java.io.*;
import java.util.*;

/**
 *
 * @author Daveg
 */
public class MyBreathfirstsearch {
    
    private int V; //
    private LinkedList<Integer> adj[];
    
    
   // Constructor 
    MyBreathfirstsearch(int v){
        
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
        
    }
    
    // function to add an edge to the graph
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    
    // print BFS traversal from given sourse s 
    void BFS(int s){
        
        // mark all vertices visited false by default
        boolean visited[] = new boolean[V];
        
        // create a queue for the BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        // mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);
        
        while(queue.size() !=0){
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.println(s+" ");
            
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
    
    public static void main(String args[]){
        
        MyBreathfirstsearch g = new MyBreathfirstsearch(5);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(4, 3);
        
        System.out.println("Breath First Search starting at 1");
        g.BFS(1);
        
        System.out.println("Breath First Search starting at 2");
        g.BFS(2);
        
        
        
    } 
    
    
}
