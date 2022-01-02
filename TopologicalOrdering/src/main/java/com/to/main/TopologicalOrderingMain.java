package com.to.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 *Topological ordering heavily relies on DFS
 * It crucially used in Project Management tools like Maven, ant and Gradle
 */
public class TopologicalOrderingMain {
    public static void main(String[] args) {
        TopologicalOrderingImpl impl = new TopologicalOrderingImpl();
        List<Vertex> vertexList = new ArrayList<>();


        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        vertexList.add(v0);
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);


        vertexList.get(2).addNeighbour(v3);
        vertexList.get(5).addNeighbour(v2);
        vertexList.get(5).addNeighbour(v0);
        vertexList.get(4).addNeighbour(v0);
        vertexList.get(4).addNeighbour(v1);
        vertexList.get(3).addNeighbour(v1);

        for (int i = 0; i < vertexList.size(); i++) {
            if(!vertexList.get(i).isVisited()){
                impl.dfs(vertexList.get(i));
            }
        }
        Stack<Vertex> stack = impl.getVertex();
        for (int i = 0; i < vertexList.size(); i++) {
            System.out.println(stack.pop());
        }
    }
}
