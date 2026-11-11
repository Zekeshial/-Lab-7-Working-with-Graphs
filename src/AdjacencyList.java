import java.util.*;

public class AdjacencyList {
    private final HashMap<String, ArrayList<Edge>> map;

    public AdjacencyList() {
        this.map = new HashMap<String, ArrayList<Edge>>();
    }


    /**
     * Adds a vertex with its edge the Adjacency List
     * @param vertex The vertex of the point as a string
     * @param edge and edge connected to that vertex.
     */
    public void addEdge(String vertex, Edge edge) {
        String other = edge.getVertex();
        Edge reversedEdge = new Edge(edge.getWeight(), vertex);

        // Make sure both endpoints exist
        ArrayList<Edge> fromList = map.computeIfAbsent(vertex, k -> new ArrayList<>());
        ArrayList<Edge> toList = map.computeIfAbsent(other, k -> new ArrayList<>());

        if (fromList.contains(edge)) {
            System.out.println("This connection already exists");
            return;
        }

        fromList.add(edge);
        if (!vertex.equals(other) && !toList.contains(reversedEdge)) {            // avoid a duplicate entry for self-loops
            toList.add(reversedEdge);
        }
    }

    /**
     * Adds just a vertex to the Adjacency List
     * @param vertex The vertex you want to add as a string
     */
    public void addVertex(String vertex) {
        if (map.containsKey(vertex)) {
            System.out.println("Vertex already exists");
        } else {
            map.put(vertex, new ArrayList<>());
            System.out.println("Vertex has been added");
        }
    }

    /**
     * Removes a vertex with its edges and connections from other edges in an Adjacency List
     * @param vertex The vertex you wish to remove as a String.
     */
    public void removeVertex(String vertex) {

            ArrayList<Edge> removedEdges = map.remove(vertex);

            if (removedEdges == null) {
                System.out.println("Vertex doesn't exist");
                return;
            }

            // Undirected graph: only the neighbors of `vertex` can have an edge back to it
            for (Edge edge : removedEdges) {
                ArrayList<Edge> neighborEdges = map.get(edge.getVertex());
                if (neighborEdges != null) {
                    neighborEdges.removeIf(e -> e.getVertex().equals(vertex));
                }
            }

            System.out.println("Vertex has been removed");
        }

    /**
     * Removes an Edge from an adjacency List
     * @param vertex The vertex associated with the edge
     * @param edge The edge you wish to remove associated to that vertex.
     */
    public void removeEdge(String vertex, Edge edge) {
        String otherVertex = edge.getVertex();
        Edge reversedEdge = new Edge(edge.getWeight(), vertex);

        if (!map.containsKey(vertex)) {
            System.out.println("Vertex doesn't exist");
        } else if (map.containsKey(vertex) && !map.get(vertex).contains(edge)) {
            System.out.println("Edge doesn't exist");
        } else if (map.containsKey(vertex) && map.get(vertex).contains(edge) && !map.containsKey(otherVertex)) {
            System.out.println("Other vertex doesn't exist.");
        } else if (map.containsKey(vertex) && map.get(vertex).contains(edge) && map.containsKey(edge.getVertex()) && !map.get(edge.getVertex()).contains(reversedEdge)) {
            System.out.println("The other vertex's edge doesn't exist");
        } else if (map.containsKey(vertex) && map.get(vertex).contains(edge) && map.containsKey(edge.getVertex()) && map.get(edge.getVertex()).contains(reversedEdge)) {
            map.get(vertex).remove(edge);
            map.get(edge.getVertex()).remove(reversedEdge);
            System.out.println("Edge has been removed");
        }

    }

    /**
     * returns the Adjacency List as an unmodifiable collection
     * @return the Adjacency List
     */
    public Map<String, ArrayList<Edge>> getMap() {
        return Collections.unmodifiableMap(map);
    }

    /**
     * Print out the Adjacency List.
     */
    public void printAdjacencyList() {
        for (Map.Entry<String, ArrayList<Edge> > entry : map.entrySet()) {
            System.out.print(entry.getKey() + " has connections to: ");
            for (Edge edge : entry.getValue()) {
                System.out.print("<" + edge.getVertex() + ", " + edge.getWeight() + ">, ");
            }
            System.out.println();
        }
    }

    /**
     * Does a Breath first search over a data structure
     * @param startVertex the starting vertex you wish to look at in the data structure
     * @return The result of the search in the form [(first point), (second point), ... (last point)]
     */
    public String BFS(String startVertex) {
        if (!map.containsKey(startVertex)) {
            System.out.println("The starting vertex was not found in the graph");
            return null;
        }


        Queue<String> open = new ArrayDeque<>();
        Set<String> explored = new HashSet<>();
        ArrayList<String> listToPrint = new ArrayList<>();

        open.add(startVertex);


        while(!open.isEmpty()) {
            String v = open.peek();
            open.remove();
            if (!explored.contains(v)) {
                explored.add(v);
                listToPrint.add(v);
                for(Edge vertex : map.get(v)) {
                    String vertex2 = vertex.getVertex();
                    if (!explored.contains(vertex2)) {
                        open.add(vertex2);
                    }
                }
            }
        }
        return listToPrint.toString();
    }







}
