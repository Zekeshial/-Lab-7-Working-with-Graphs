import java.util.*;

public class AdjacencyMatrix {

    private double[][] adjacencyMatrix;
    private int numberOfVertices;
    private static final int noEdge = 0;

    public AdjacencyMatrix(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.adjacencyMatrix = new double[numberOfVertices][numberOfVertices];
    }

    /**
     * Converts a String into an int
     * @param vertex the vertex you want to convert into an int
     * @return the integer result of the vertex
     */
    public int toIndex(String vertex) {
        char v = vertex.charAt(0);
        int index = Character.toUpperCase(v) - 'A';
        if (index < 0 || index >= numberOfVertices) {
            throw new IllegalArgumentException("Invalid vertex: " + v);
        }
        return index;
    }

    /**
     * Adds an edge to an Adjacency Matrix
     * @param vertex the vertex you wish to add as a string
     * @param e the edge you wish to add as an edge object
     */
    public void addEdge(String vertex, Edge e) {
        int i = toIndex(vertex);
        int j = toIndex(e.getVertex());
        adjacencyMatrix[i][j] = e.getWeight();
        adjacencyMatrix[j][i] = e.getWeight(); // remove this line for a directed graph
    }

    /**
     * Gives you the weight at a specific point in the data structure
     * @param from The starting String you a going from.
     * @param to The String you wish to go to.
     * @return The weight at the specific point
     */
    public double getWeight(String from, String to) {
        return adjacencyMatrix[toIndex(from)][toIndex(to)];
    }

    /**
     * Tells you if a connection exists between two vertexes
     * @param from The starting vertex
     * @param to The vertex you are going to
     * @return A true or false value for if that connection exists.
     */
    public boolean hasEdge(String from, String to) {
        return getWeight(from, to) != noEdge;
    }

    /**
     * Prints out the Adjacency Matrix
     */
    public void printAdjacencyMatrix() {
        // Header row of letters
        System.out.print("   ");
        for (int i = 0; i < numberOfVertices; i++) {
            System.out.printf("%6c", (char) ('A' + i));
        }
        System.out.println();

        // Each row, labeled with its letter
        for (int i = 0; i < numberOfVertices; i++) {
            System.out.printf("%6c", (char) ('A' + i));
            for (int j = 0; j < numberOfVertices; j++) {
                System.out.printf("%6.2f", adjacencyMatrix[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Does a breadth first search over an Adjacency matrix.
     * @param startVertex The starting vertex you wish to go over
     * @return The result of the search in the form [(first point), (second point), ... (last point)]
     */
    public String BFS(String startVertex) {


        ArrayList<String> listToPrint = new ArrayList<>();
        Set<String> explored = new HashSet<>();
        Queue<String> open = new LinkedList<>();

        String start = String.valueOf((char) (('A' + toIndex(startVertex))));

        open.add(start);
        explored.add(start);

        while (!open.isEmpty()) {
            String v = open.remove();
            int current = toIndex(v);
            listToPrint.add(v);

            for (int i = 0; i < numberOfVertices; i++) {
                String neighbor = String.valueOf((char) ('A' + i));

                    if (adjacencyMatrix[current][i] != noEdge && !explored.contains(neighbor)) {
                        explored.add(String.valueOf((char) ('A' + i)));
                        open.add(String.valueOf((char) ('A' + i)));
                    }
                }
            }

        return listToPrint.toString();
    }
}
