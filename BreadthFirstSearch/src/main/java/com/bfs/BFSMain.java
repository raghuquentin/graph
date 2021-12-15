package com.bfs;

/**
 *              A
 *           /  |  \
 *          B   F   G
 *        /  \       \
 *        C   D       H
 *            /
 *            E
 * Above tree structure traversed by using Breadth First Search
 * The main DS is Queue
 *
 */
public class BFSMain {
    public static void main(String[] args) {
        Vertex a= new Vertex("A");
        Vertex b= new Vertex("B");
        Vertex c= new Vertex("C");
        Vertex d= new Vertex("D");
        Vertex e= new Vertex("E");
        Vertex f= new Vertex("F");
        Vertex g= new Vertex("G");
        Vertex h= new Vertex("H");
        a.addNeighBour(b);
        a.addNeighBour(f);
        a.addNeighBour(g);

        b.addNeighBour(c);
        b.addNeighBour(d);

        d.addNeighBour(e);

        g.addNeighBour(h);

        BFSSearch search = new BFSSearch();
        search.traverse(a);
    }
}
