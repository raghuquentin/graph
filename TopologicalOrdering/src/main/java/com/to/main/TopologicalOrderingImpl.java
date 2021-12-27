package com.to.main;

import java.util.Stack;

public class TopologicalOrderingImpl {
    private Stack<Vertex> stack;

    public TopologicalOrderingImpl(){
        this.stack=new Stack<Vertex>();
    }
    public void dfs(Vertex vertex){
        vertex.setVisited(true);
        System.out.println(vertex);
        for (Vertex v:vertex.getAdjecencyList()){
            if(!v.isVisited()){
                dfs(v);
            }
        }
    }
}
