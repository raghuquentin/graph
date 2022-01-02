package com.to.main;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private List<Vertex> adjecencyList;
    private boolean isVisited;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex> getAdjecencyList() {
        return adjecencyList;
    }

    public void addNeighbour(Vertex v) {
        this.adjecencyList.add(v);
    }

    public boolean isVisited() {
        return isVisited;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public Vertex(String name){
        this.name = name;
        this.adjecencyList = new ArrayList<Vertex>();
    }
}
