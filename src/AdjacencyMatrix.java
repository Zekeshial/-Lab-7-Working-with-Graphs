import java.util.*;

public class AdjacencyMatrix {

    private double[][] adjacencyMatrix;
    private int numberOfVertices;
    private static final int noEdge = 0;
    private ArrayList<String> vertices;
    private Set<String> existingVertices;

    public AdjacencyMatrix(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.adjacencyMatrix = new double[numberOfVertices][numberOfVertices];
        this.vertices = new ArrayList<String>();
        this.existingVertices = new HashSet<>();
    }

    /**
     * Adds a weight to the adjacency matrix
     * @param vertex the vertex you wish to add as a string
     * @param e the edge you wish to add as an edge object
     */
    public void addEdge(String vertex, Edge e) {
        if (!existingVertices.contains(vertex)) {
            existingVertices.add(vertex);
            vertices.add(vertex);
        }

        if (!existingVertices.contains(e.getVertex())) {
            existingVertices.add(e.getVertex());
            vertices.add(e.getVertex());
        }

        int i = vertices.indexOf(vertex);
        int j = vertices.indexOf(e.getVertex());
        adjacencyMatrix[i][j] = e.getWeight();
        adjacencyMatrix[j][i] = e.getWeight();
    }

    /**
     * Gives you the weight at a specific point in the data structure. If the weight doesn't exist it returns 0.
     * @param from The starting String you a going from.
     * @param to The String you wish to go to.
     * @return The weight at the specific point
     */
    public double getWeight(String from, String to) {
        if (existingVertices.contains(from) && existingVertices.contains(to)) {
            return adjacencyMatrix[vertices.indexOf(from)][vertices.indexOf(to)];
        }
        return noEdge;
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
    public boolean printAdjacencyMatrix() {
        // Header row of letters
        System.out.print("   ");
        for (int i = 0; i < numberOfVertices; i++) {
            System.out.printf("%6s", vertices.get(i));
        }
        System.out.println();

        // Each row, labeled with its letter
        for (int i = 0; i < numberOfVertices; i++) {
            System.out.printf("%6s", vertices.get(i));
            for (int j = 0; j < numberOfVertices; j++) {
                System.out.printf("%6.2f", adjacencyMatrix[i][j]);
            }
            System.out.println();
        }

        return true;
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


        open.add(startVertex);
        explored.add(startVertex);

        while (!open.isEmpty()) {
            String v = open.remove();
            int current = vertices.indexOf(v);
            listToPrint.add(v);

            for (int i = 0; i < numberOfVertices; i++) {
                String neighbor = vertices.get(i);

                    if (adjacencyMatrix[current][i] != noEdge && !explored.contains(neighbor)) {
                        explored.add(vertices.get(i));
                        open.add(vertices.get(i));
                    }
                }
            }

        return listToPrint.toString();
    }
}
