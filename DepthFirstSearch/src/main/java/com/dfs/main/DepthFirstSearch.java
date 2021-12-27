package com.dfs.main;

import com.dfs.model.Vertex;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    Stack<Vertex> stack;
    public DepthFirstSearch(){
        stack = new Stack<Vertex>();
    }
    public void traverse(List<Vertex> adjacencyList){
        for (Vertex v:adjacencyList) {
            if(!v.isVisited())
                traverseHelper(v);
        }
    }
    private void traverseHelper(Vertex rootVertex) {
        stack.add(rootVertex);
        rootVertex.setVisited(true);
        while (!stack.isEmpty()){
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);
            for (Vertex v1: actualVertex.getAdjencyList()) {
                if(!v1.isVisited()){
                    v1.setVisited(true);
                    stack.add(v1);
                }
            }
        }
    }
}
