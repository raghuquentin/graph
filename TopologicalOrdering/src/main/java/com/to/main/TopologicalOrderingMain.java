package com.to.main;
/*
 *Topological ordering heavily relies on DFS
 * It crucially used in Project Management tools like Maven, ant and Gradle
 */
public class TopologicalOrderingMain {
    public static void main(String[] args) {
        TopologicalOrderingImpl impl = new TopologicalOrderingImpl();

        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v2.addNeighbour(v3);
        v5.addNeighbour(v2);
        v5.addNeighbour(v0);
        v4.addNeighbour(v0);
        v4.addNeighbour(v1);
        v3.addNeighbour(v1);

        impl.dfs(v5);
    }
}
