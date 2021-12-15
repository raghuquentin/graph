package com.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean isVisited;
    private List<Vertex> adjencyList;

    public Vertex(String name){
        this.name = name;
        this.adjencyList = new ArrayList<Vertex>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public List<Vertex> getAdjencyList() {
        return adjencyList;
    }

    public void addNeighBour(Vertex v) {
        this.adjencyList.add(v);
    }
}
