package Data;

public class GraphInterface {
    
    public static void main(String [] args) {
        
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

        // Traversal Methods:
            // Depth-First Search
            // Breadth-First Search
        
            // Both result in a spanning tree, which can be modelled using a class


        // Depth-First Search:

            // search starts from any vertex
                // vist v;
                // for each neighbor w of v
                    // if (w has not been visited) {
                    // dfs(w);
                    // }


        // Appliation of DFS:
            // detecting whetehre a graph is connected
            // detecing whether there is a path between two vertices
            // finding a path between two vertices
            // finding all connected components
            // detecting whether there is a cycle in the graph
            // finding a cycle in the graph
            // testing whether a graph is bipartite





        // Breadth-First Search:

            // search starts at vertex 0 of the graph
                // the vertices are visited level by level
                        
                    // bfs(vertex v) {
                        // create an empty queue for storing vertices to be visited;
                        // add v into the queue;
                        // mark v as visited;
                        // while(queue != empty) {
                            // dequeue vertex u from the queue;
                            // process u;
                            // for each neighbor w of y {
                                // if w has not been visited {
                                    // add w to the queue;
                                    // mark w visited;
                                // }
                            // }
                        // }
                    // }

                    
        // Applications of BFS:
            // Detecting whether a graph is connected
            // Detecting whetehre there is a path between two vertices
            // Finding the shortest path between two vertices
            // Finding all connected components
            // Detecting whether there is a cycle in the graph
            // Finding the cycle in the graph
            // Testing whether a graph is bipartite
    }

    
}
