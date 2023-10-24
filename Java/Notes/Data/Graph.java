package Data;

import java.util.*;

public class Graph {

    public static void main(String [] args) {

        // Graphs:

            // a mathematical structure that represents relationships among entities in the real world
            // for convenience, we define a graph as G = (Vertices , Edges)

        // Graph Terminology:

            // Vertices: Points on the graph
            // Edges: Pathways connecting various points on a graph

            // Weighted Graphs: graphs, where different edges are given a different numerical weight
            // Directed/Undirected Graphs: graphs, where edges are set to travel in a specific direction

            // Adjacent Vertices: 2 Vertices that are connected to the same edge
            // Incident: an edge in a graph that joins 2 vertices, is incident to both vertices
            // Degree: the number of edges incident to it (number of edges touching a vertex)
            // Neighbour: Two vertices or Two edges are neighbours if they are adjacent

            // Loop: an edge that connects exclusively 1 vertex to itself
            // Parallel Edge: 2 Vertices that are connected by 2 or more edges

            // Simple Graph: graph that doesnt have loops or parallel edges
            // Complete Graph: Every Vertex connects to every other vertex
            // SubGraph: A graph that contains all the vertices of the graph (not necessarily all the edges)
            // Spanning Tree: A subgraph, that contains the minimum amount of edges required to connect everything



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
            {123},  // reference of a linked list of connections to other indexes in the array
            {023},
            {013},
            {012}
        };


        // Edges using Edge Object:
            // create a class capable of storing 2 integers, and call it whenever adding a new edge coordinated to the ArrayList

        List<Edge> list = new ArrayList<>();
        list.add(new Graph().new Edge(0,1));
        list.add(new Graph().new Edge(0,3));
        list.add(new Graph().new Edge(0,5));
        list.add(new Graph().new Edge(1,0));
        list.add(new Graph().new Edge(1,3));
        list.add(new Graph().new Edge(2,1));

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