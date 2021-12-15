package com.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSSearch {

    private Queue<Vertex> queue = new LinkedList<Vertex>();

    public void traverse(Vertex v){
        queue.add(v);
        v.setVisited(true);

        while (!queue.isEmpty()){
            Vertex visitedVertex= queue.remove();
            System.out.println("visitedVertex :: "+visitedVertex.getName());
            for (Vertex notVisitedVertex : visitedVertex.getAdjencyList()){
                queue.add(notVisitedVertex);
                notVisitedVertex.setVisited(true);
            }
        }
    }
}
