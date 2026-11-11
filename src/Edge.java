import java.util.Objects;

public class Edge {
    private final double weight;
    private final String vertex;

    public Edge(double weight, String vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }

    public double getWeight() {
        return weight;
    }


    public String getVertex() {
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
        return weight == other.weight &&
                Objects.equals(vertex, other.vertex);
    }

    @Override
    public int hashCode() {
        // Use Objects.hash to safely compute hash values based on the same fields used in equals()
        return Objects.hash(weight, vertex);
    }
}

