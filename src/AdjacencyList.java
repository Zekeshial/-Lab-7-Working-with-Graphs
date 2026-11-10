import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyList<T> {
    private final HashMap<T, ArrayList<Edge<T>>> map;

    public AdjacencyList() {
        this.map = new HashMap<T, ArrayList<Edge<T>>>();
    }


    public void addEdge(T vertex, Edge<T> edge) {
        T other = edge.getVertex();
        Edge<T> reversedEdge = new Edge<>(edge.getWeight(), vertex);

        // Make sure both endpoints exist
        ArrayList<Edge<T>> fromList = map.computeIfAbsent(vertex, k -> new ArrayList<>());
        ArrayList<Edge<T>> toList = map.computeIfAbsent(other, k -> new ArrayList<>());

        if (fromList.contains(edge)) {
            System.out.println("This connection already exists");
            return;
        }

        fromList.add(edge);
        if (!vertex.equals(other) && !toList.contains(reversedEdge)) {            // avoid a duplicate entry for self-loops
            toList.add(reversedEdge);
        }
        System.out.println("Connection has been added");
    }

    public void addVertex(T vertex) {
        if (map.containsKey(vertex)) {
            System.out.println("Vertex already exists");
        } else {
            map.put(vertex, new ArrayList<>());
            System.out.println("Vertex has been added");
        }
    }

    public void removeVertex(T vertex) {

            ArrayList<Edge<T>> removedEdges = map.remove(vertex);

            if (removedEdges == null) {
                System.out.println("Vertex doesn't exist");
                return;
            }

            // Undirected graph: only the neighbors of `vertex` can have an edge back to it
            for (Edge<T> edge : removedEdges) {
                ArrayList<Edge<T>> neighborEdges = map.get(edge.getVertex());
                if (neighborEdges != null) {
                    neighborEdges.removeIf(e -> e.getVertex().equals(vertex));
                }
            }

            System.out.println("Vertex has been removed");
        }

    public void removeEdge(T vertex, Edge<T> edge) {
        T otherVertex = edge.getVertex();
        Edge<T> reversedEdge = new Edge<>(edge.getWeight(), vertex);

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

    public Map<T, ArrayList<Edge<T>>> getMap() {
        return Collections.unmodifiableMap(map);
    }

    public void printAdjacencyList() {
        for (Map.Entry<T, ArrayList<Edge<T>> > entry : map.entrySet()) {
            System.out.print(entry.getKey() + " has connections to: ");
            for (Edge<T> edge : entry.getValue()) {
                System.out.print("<" + edge.getVertex() + ", " + edge.getWeight() + ">");
            }
            System.out.println();
        }
    }




}
