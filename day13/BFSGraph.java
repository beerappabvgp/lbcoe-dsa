package day13;

import java.util.*;

public class BFSGraph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    public void runBFS(int startNode) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(startNode);
        queue.add(startNode);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node + " ");
            List<Integer> neighbors = adjList.getOrDefault(node, new ArrayList<>());
            Collections.sort(neighbors);
            for (int nei: neighbors) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    queue.add(nei);
                }
            }
        }
    }


    public static void main(String[] args) {
        BFSGraph g = new BFSGraph();
        g.addEdge(0,1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("BFS Traversal starting from node 0: ");
        g.runBFS(0);
    }

}
