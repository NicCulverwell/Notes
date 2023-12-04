package Data;

import java.util.*;
import java.util.List;

class Graphs {

    public static void main(String [] args) {

        // Representing Graphs:
            // Vertices:
                // Array List 
                // Array
            // Edges: 
                // Edge Array
                // Edge Objects
                // Adjacency Matrices
                // Adjacency Lists


        // Vertices using Arrays:

        String [] verticesOne = {"Durban", "Johannesburg", "Cape Town", "Pretoria"};

        System.out.println(verticesOne[0]);
        System.out.println(verticesOne[1]);
        System.out.println(verticesOne[2]);
        System.out.println(verticesOne[3]);


        // Vertices using ArrayLists:

        List <String> verticesTwo = new ArrayList<>();

        verticesTwo.add("Durban");
        verticesTwo.add("Johannesburg");
        verticesTwo.add("Cape Town");
        verticesTwo.add("Pretoria");

        System.out.println("\n");
        
        System.out.println(verticesTwo.get(0));
        System.out.println(verticesTwo.get(1));
        System.out.println(verticesTwo.get(2));
        System.out.println(verticesTwo.get(3));

        // Edges using Edge Array:
            // Array within an array,
            // inner array, stores the end points of the edges
                // {0,1} is an edge, that connect with vertex 0 and vertex 1

        int [][] edgesOne = {{0,1}, {0,3}, {0,5}, {1,0}, {1,3}, {2,1}};
        System.out.println("\n[" + edgesOne[0][0] + ", " + edgesOne[0][1] + "]");

        // Edges using Adjacency Matrix

        int [][] adjacencyMatrix = {
            {0,1,0,1}, // Durban
            {1,0,1,0}, // Johannesburg
            {0,1,0,1}, // Cape Town
            {1,0,1,0} // Pretoria
        };

        System.out.println("\n[" + adjacencyMatrix[0][0] + ", " + adjacencyMatrix[0][1] + ", " + adjacencyMatrix[0][2] + ", " + adjacencyMatrix[0][3] + "]");

        // Edges using Adjacency Lists:

        int [][] adjacencyList = {
            {1,2,3},  // reference of a linked list of connections to other indexes in the array
            {0,2,3},
            {0,1,3},
            {0,1,2}
        };

        System.out.println(adjacencyList[0][0] + ", " + adjacencyList[0][1] + ", " + adjacencyList[0][2]);

        // Edges using Edge Object:
            // create a class capable of storing 2 integers, and call it whenever adding a new edge coordinated to the ArrayList

        List<Edge> list = new ArrayList<>();
        list.add(new Graphs().new Edge(0,1));
        list.add(new Graphs().new Edge(0,3));
        list.add(new Graphs().new Edge(0,5));
        list.add(new Graphs().new Edge(1,0));
        list.add(new Graphs().new Edge(1,3));
        list.add(new Graphs().new Edge(2,1));

        System.out.println("\n" + list.get(0));

    }  
    
    public class Edge {

        int u,v;

        public Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }

    }

}


 // GRAPH INTERFACE:


        // getSize()                - returns the number of vertices in the graph
        // GetVertices()            - returns the vertices in the graph
        // getVertex()              - returns the vertex object of the specified vertex index
        // GetIndex(Vertex)         - returns the index for the specified vertex
        // GetDegree()              - returns the degree for a specified vertex index
        // getAdjacencyMatrix()     - returns the adjacency matrix
        // printAdjacencyMatrix()   - prints the adjacency vertex
        // printEdges()             - prints the edges
        // dfs(int)                 - obtains a depth-first search tree
        // bfs(int)                 - obtains a breadth-first search tree