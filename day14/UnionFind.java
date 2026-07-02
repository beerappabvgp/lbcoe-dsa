package day14;

public class UnionFind {

    private int[] parent;
    private int[] rank;

    // Initialize: Each node is its own parent (rank 0)
    public UnionFind(int numberOfNodes) {

        parent = new int[numberOfNodes];
        rank = new int[numberOfNodes];

        for (int node = 0; node < numberOfNodes; node++) {
            parent[node] = node;
            rank[node] = 0;
        }
    }

    // Find with Path Compression
    public int find(int node) {

        if (parent[node] != node) {
            parent[node] = find(parent[node]);
        }

        return parent[node];
    }

    // Union by Rank
    public void union(int firstNode, int secondNode) {

        int firstRoot = find(firstNode);
        int secondRoot = find(secondNode);

        if (firstRoot != secondRoot) {

            if (rank[firstRoot] < rank[secondRoot]) {

                parent[firstRoot] = secondRoot;

            } else if (rank[firstRoot] > rank[secondRoot]) {

                parent[secondRoot] = firstRoot;

            } else {

                parent[firstRoot] = secondRoot;
                rank[secondRoot]++;
            }
        }
    }

    public static void main(String[] args) {

        int numberOfNodes = 5;

        UnionFind unionFind = new UnionFind(numberOfNodes);

        // Connect nodes
        unionFind.union(0, 1);
        unionFind.union(2, 3);
        unionFind.union(0, 2);

        // Check connectivity
        System.out.println("Are 1 and 3 connected? " +
                (unionFind.find(1) == unionFind.find(3)));

        System.out.println("Are 1 and 4 connected? " +
                (unionFind.find(1) == unionFind.find(4)));
    }
}