import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    private T data;
    private ArrayList<Edge> edge;


    // old method from adjacency List

//    public void addEdgeOld(T vertex, Edge<T> edge) {
//        T otherVertex = edge.getVertex();
//        Edge<T> reverisedEdge = new Edge<>(edge.getWeight(), vertex);
//
//
//        if (!map.containsKey(vertex) && !map.containsKey(otherVertex)) {
//            map.put(vertex, new ArrayList<Edge<T>>(List.of(edge)));
//            map.put(edge.getVertex(), new ArrayList<Edge<T>>(List.of(reverisedEdge)));
//            System.out.println("Vertex and edge has been added.");
//        } else if (!map.containsKey(vertex) && map.containsKey(otherVertex)) {
//            map.put(vertex, new ArrayList<Edge<T>>(List.of(edge)));
//            map.get(edge.getVertex()).add(reverisedEdge);
//            System.out.println("Vertex and edge has been added.");
//        } else if (map.containsKey(vertex) && !map.containsKey(otherVertex)) {
//            map.get(vertex).add(edge);
//            map.put(edge.getVertex(), new ArrayList<Edge<T>>(List.of(reverisedEdge)));
//            System.out.println("Vertex and edge has been added.");
//        } else if (map.containsKey(vertex) && !map.get(vertex).contains(edge)) {
//            map.get(vertex).add(edge);
//            map.get(edge.getVertex()).add(reverisedEdge);
//            System.out.println("connection has been added");
//        } else if (map.containsKey(vertex) && map.get(vertex).contains(edge)) {
//            System.out.println("This vertex to edge already exists");
//        }
//    }
}
