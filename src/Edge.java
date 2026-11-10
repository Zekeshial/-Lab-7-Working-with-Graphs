import java.util.Objects;

public class Edge<T> {
    private final int weight;
    private final T vertex;

    public Edge(int weight, T vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }

    public int getWeight() {
        return weight;
    }


    public T getVertex() {
        return vertex;
    }


    @Override
    public boolean equals(Object obj) {
        // 1. Check for reference equality (fast path)
        if (this == obj) return true;

        // 2. Check for null and ensure exact class match
        if (obj == null || getClass() != obj.getClass()) return false;

        // 3. Cast the object to the correct type
        Edge other = (Edge) obj;

        // 4. Compare relevant fields
        return Objects.equals(vertex, other.vertex);
    }

    @Override
    public int hashCode() {
        // Use Objects.hash to safely compute hash values based on the vertex
        return Objects.hash(vertex);
    }
}
