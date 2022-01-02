package com.to.main;

import java.util.Stack;

public class TopologicalOrderingImpl {
    private Stack<Vertex> stack;

    public TopologicalOrderingImpl(){
        this.stack=new Stack<Vertex>();
    }
    public void dfs(Vertex vertex){
        vertex.setVisited(true);

        for (Vertex v:vertex.getAdjecencyList()){
            if(!v.isVisited()){
                dfs(v);
            }
        }

        stack.push(vertex);
    }
    public Stack getVertex(){
        return this.stack;
    }
}
