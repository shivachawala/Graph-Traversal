package com.CS5343;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph graph = new Graph(16);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(6,7);
        graph.addEdge(8,9);
        graph.addEdge(9,10);
        graph.addEdge(10,11);
        graph.addEdge(11,12);
        graph.addEdge(13,14);
        graph.addEdge(14,15);
        graph.addEdge(15,0);
        graph.addEdge(0,8);
        graph.addEdge(1,10);
        graph.addEdge(2,9);
        graph.addEdge(3,11);
        graph.addEdge(3,14);
        graph.addEdge(4,7);
        graph.addEdge(4,13);
        graph.addEdge(5,8);
        graph.addEdge(5,15);
        graph.printGraph();
        System.out.println("DFS Traversal");
        graph.DFS(3);
        System.out.println();
        System.out.println("BFS Traversal");
        graph.BFS(3);
//        System.out.println();
//        for (int i=0; i<graph.vertices; i++)
//        {
//            if(graph.visited[i]!=true)
//            {
//                graph.DFS(i);
//            }
//        }

    }
}
