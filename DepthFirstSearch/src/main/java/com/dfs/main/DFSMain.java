package com.dfs.main;

import com.dfs.model.Vertex;

import java.util.ArrayList;
import java.util.List;

public class DFSMain {
    public static void main(String[] args) {
        Vertex v1= new Vertex("A");
        Vertex v2= new Vertex("B");
        Vertex v3= new Vertex("C");
        Vertex v4= new Vertex("D");
        Vertex v5= new Vertex("E");


        v1.addNeighBour(v2);
        v1.addNeighBour(v3);
        v3.addNeighBour(v4);
        v4.addNeighBour(v5);

        List<Vertex> vertexList = new ArrayList<Vertex>();
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);

        DepthFirstSearch search = new DepthFirstSearch();
        search.traverse(vertexList);
    }
}

