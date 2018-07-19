package com.CS5343;

import java.util.LinkedList;

public class Graph {

    int vertices;
    boolean[] visited;
    boolean[] visitedBFS;
    Queue queue;
    LinkedList<LinkedList<Integer>> list;
    public Graph(int vertices)
    {
        this.vertices = vertices;
        visited = new boolean[vertices];
        visitedBFS = new boolean[vertices];
        queue = new Queue(vertices);
        list = new LinkedList<LinkedList<Integer>>();
        for(int i=0; i<vertices; i++)
        {
            list.add(i, new LinkedList<Integer>());
        }
    }

    public void addEdge(int source, int destination)
    {
        list.get(source).add(destination);
    }

    public void printGraph()
    {
        for (int i=0; i<vertices; i++)
        {
            System.out.println("For vertex " +i+ " vertices connected are");
            LinkedList<Integer> nodeList = list.get(i);
            for (int j=0; j<nodeList.size(); j++)
            {
                System.out.print(nodeList.get(j).intValue()+",");
            }
            System.out.println();
        }
    }

    public void DFS(int startVertex)
    {
        LinkedList<Integer> nodeList = list.get(startVertex);
        if(!visited[startVertex])
        {
            System.out.print(startVertex+"-->");
        }

        if(!visited[startVertex])
        {
            visited[startVertex] = true;
            for(int i=0; i<nodeList.size(); i++)
            {
                DFS(nodeList.get(i).intValue());
            }
        }
    }

    public void BFS(int startVertex)
    {
        if(!visitedBFS[startVertex])
        {
            queue.push(startVertex);
            visitedBFS[startVertex] = true;
        }

        System.out.print(queue.pop()+"-->");
        visitNode(startVertex);
        if(queue.tail!=-1)
        BFS(queue.arr[queue.tail]);
        else
            return;
    }

    private void visitNode(int visit)
    {
        LinkedList<Integer> nodeList = list.get(visit);
        for (int i=0; i<nodeList.size(); i++)
        {
            if(!visitedBFS[nodeList.get(i).intValue()])
            {
                queue.push(nodeList.get(i).intValue());
                visitedBFS[nodeList.get(i).intValue()] = true;
            }

        }
    }

}
