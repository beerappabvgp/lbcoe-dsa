package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSGraph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public void runDFS(int startNode) {
        Set<Integer> visited = new HashSet<>();
        dfs(startNode, visited);
    }

    public void dfs(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.println(node + " ");
        // get the neighbors 
        List<Integer> neighbors = adjList.getOrDefault(node, new ArrayList<>());
        Collections.sort(neighbors);
        for (int nei : neighbors) {
            if (!visited.contains(nei)) {
                dfs(nei, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph();
        g.addEdge(0,1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Dfs Traversal starting from node 0: ");
        g.runDFS(0);
    }
}
