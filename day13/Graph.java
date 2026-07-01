package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    // add node to the map
    public void addVertex(Integer nodeNumber) {
        adjList.putIfAbsent(nodeNumber, new ArrayList<>());
    }

    public void addEdge(Integer source, Integer destination) {
        addVertex(source);
        addVertex(destination);
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void printGraph() {
        for (Integer node : adjList.keySet()) {
            System.out.println("Node: " + node + " is connected to " + adjList.get(node));
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0,1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }
}
