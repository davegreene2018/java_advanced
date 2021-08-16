/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijktrastutorial;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jthangaraj
 */
public class DijktrasTutorial {
    
    //1.create 2 lists - vertex and edges
    /**
     * @param args the command line arguments
     */
	private List<Vertex> nodes;
    private List<Edge> edges;
        
   //Part3 
  //3a.b..This add lane takes in the laneId, sourceLocNo, destinationNumber and duration
    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
   
   //3c.Then we add this to the edges list
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
        edges.add(lane);
    }
    
  //2. create method
    public void testExcute() {
 //2a.create new instances of the lists
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
    
//2b.loop through 11 nodes and add them to the vertex
        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("Node_" + i, "Node_" + i);
            nodes.add(location);
        }
//2c.Add the lanes
        addLane("Edge_0", 0, 1, 85);
        addLane("Edge_1", 0, 2, 217);
        addLane("Edge_2", 0, 4, 173);
        addLane("Edge_3", 2, 6, 186);
        addLane("Edge_4", 2, 7, 103);
        addLane("Edge_5", 3, 7, 183);
        addLane("Edge_6", 5, 8, 250);
        addLane("Edge_7", 8, 9, 84);
        addLane("Edge_8", 7, 9, 167);
        addLane("Edge_9", 4, 9, 502);
        addLane("Edge_10", 9, 10, 40);
        addLane("Edge_11", 4, 10, 600);
       
 //2d.Create a new instance of the Graphs class and this will take in the parameter of the nodes and edges
       // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
  //2e.Then create a new instance of the DijkstrasAlgorithm and add the graph
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        
  //2f.Now run the execute method from the Dijkstra and this will take in the parameter of the nodes at position 0, this is to ensure we start at the beginning of the graph

        dijkstra.execute(nodes.get(0));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(10));

 //       assertNotNull(path);
   //     assertTrue(path.size() > 0);
//2g.Then to print out the vertex�s we can use a for each loop to loop through the vertex and paths and then print out the quickest vertex

        for (Vertex vertex : path) {
            System.out.println(vertex);
        }

    }
    
    public static void main(String[] args) {
        // call your method you have created
    	DijktrasTutorial test1= new DijktrasTutorial();
    	test1.testExcute();
    	
    }
    
    //create method
    
    //create new instances of the lists
    
    //loop through 11 nodes and add them to the vertex
    
    //Create a new instance of the Graphs class and this will take in the parameter of the nodes and edges
    
    //create a new instance of the DijkstrasAlgorithm and add the graph
    
    //Now run the execute method from the Dijkstra and this will take in the parameter of the nodes at position 0, this is to ensure we start at the beginning of the graph
    
    //Then to print out the vertex�s we can use a for each loop to loop through the vertex and paths and then print out the quickest vertex

    //This add lane takes in the laneId, sourceLocNo, destinationNumber and duration
    
    //Also we need to add the Edge, here we pass in the laneId, sourceLocationNumber, destinationLocationNumber and duration
    
    //Then we add this to the edges list

}