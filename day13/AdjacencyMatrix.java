package day13;

public class AdjacencyMatrix {
    private int[][] matrix;
    private int numVertices;

    public AdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        matrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            matrix[source][destination] = 1;
            matrix[destination][source] = 1;
        } else {
            System.out.println("Invalid nodes entered .....");
        }
    }

    public void printGraph() {
        System.out.println("Adjacency matrix : ");
        for (int r = 0; r < numVertices; r++) {
            for (int c = 0; c < numVertices; c++){
                System.out.print(
                    matrix[r][c] + "  "
                );
            }
            System.out.println();
        }
    }; 

    public static void main(String[] args) {
        AdjacencyMatrix g = new AdjacencyMatrix(5);
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
