import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AdjacencyMatrixTest {


    //testing if an edge exists within the data set
    @Test
    void addEdge() {
        Edge e1 = new Edge(2, "B");
        Edge e2 = new Edge(3, "C");
        Edge e3 = new Edge(5.5, "D");
        Edge e4 = new Edge(7, "E");
        Edge e5 = new Edge(3, "E");
        Edge e6 = new Edge(5, "F");
        Edge e7 = new Edge(5, "G");
        Edge e8 = new Edge(5.7, "H");
        Edge e9 = new Edge(4.4, "H");
        Edge e10 = new Edge(5, "I");
        Edge e11 = new Edge(4.3, "J");
        Edge e12 = new Edge(2.8, "I");
        Edge e13 = new Edge(4, "J");
        AdjacencyMatrix am = new AdjacencyMatrix(10);
        am.addEdge("A", e1);
        am.addEdge("A", e1);
        am.addEdge("A", e2);
        am.addEdge("A", e3);
        am.addEdge("B", e4);
        am.addEdge("C", e5);
        am.addEdge("D", e6);
        am.addEdge("E", e7);
        am.addEdge("E", e8);
        am.addEdge("F", e9);
        am.addEdge("F", e10);
        am.addEdge("G", e11);
        am.addEdge("H", e12);
        am.addEdge("H", e13);

        assertTrue(am.hasEdge("A", "C"));
    }


    //testing if whole integers work
    @Test
    void getWeight() {
        Edge e1 = new Edge(2, "B");
        Edge e2 = new Edge(3, "C");
        Edge e3 = new Edge(5.5, "D");
        Edge e4 = new Edge(7, "E");
        Edge e5 = new Edge(3, "E");
        Edge e6 = new Edge(5, "F");
        Edge e7 = new Edge(5, "G");
        Edge e8 = new Edge(5.7, "H");
        Edge e9 = new Edge(4.4, "H");
        Edge e10 = new Edge(5, "I");
        Edge e11 = new Edge(4.3, "J");
        Edge e12 = new Edge(2.8, "I");
        Edge e13 = new Edge(4, "J");
        AdjacencyMatrix am = new AdjacencyMatrix(10);
        am.addEdge("A", e1);
        am.addEdge("A", e1);
        am.addEdge("A", e2);
        am.addEdge("A", e3);
        am.addEdge("B", e4);
        am.addEdge("C", e5);
        am.addEdge("D", e6);
        am.addEdge("E", e7);
        am.addEdge("E", e8);
        am.addEdge("F", e9);
        am.addEdge("F", e10);
        am.addEdge("G", e11);
        am.addEdge("H", e12);
        am.addEdge("H", e13);

        double actual = am.getWeight("E", "C");
        double expect = 3;

        assertEquals(expect,actual);
    }

    //testing if decimals work
    @Test
    void getWeightTest2() {
        Edge e1 = new Edge(2, "B");
        Edge e2 = new Edge(3, "C");
        Edge e3 = new Edge(5.5, "D");
        Edge e4 = new Edge(7, "E");
        Edge e5 = new Edge(3, "E");
        Edge e6 = new Edge(5, "F");
        Edge e7 = new Edge(5, "G");
        Edge e8 = new Edge(5.7, "H");
        Edge e9 = new Edge(4.4, "H");
        Edge e10 = new Edge(5, "I");
        Edge e11 = new Edge(4.3, "J");
        Edge e12 = new Edge(2.8, "I");
        Edge e13 = new Edge(4, "J");
        AdjacencyMatrix am = new AdjacencyMatrix(10);
        am.addEdge("A", e1);
        am.addEdge("A", e1);
        am.addEdge("A", e2);
        am.addEdge("A", e3);
        am.addEdge("B", e4);
        am.addEdge("C", e5);
        am.addEdge("D", e6);
        am.addEdge("E", e7);
        am.addEdge("E", e8);
        am.addEdge("F", e9);
        am.addEdge("F", e10);
        am.addEdge("G", e11);
        am.addEdge("H", e12);
        am.addEdge("H", e13);

        double actual = am.getWeight("E", "H");
        double expect = 5.7;

        assertEquals(expect,actual);
    }

    //testing if an edge exists
    @Test
    void hasEdge() {
        Edge e1 = new Edge(2, "B");
        Edge e2 = new Edge(3, "C");
        Edge e3 = new Edge(5.5, "D");
        Edge e4 = new Edge(7, "E");
        Edge e5 = new Edge(3, "E");
        Edge e6 = new Edge(5, "F");
        Edge e7 = new Edge(5, "G");
        Edge e8 = new Edge(5.7, "H");
        Edge e9 = new Edge(4.4, "H");
        Edge e10 = new Edge(5, "I");
        Edge e11 = new Edge(4.3, "J");
        Edge e12 = new Edge(2.8, "I");
        Edge e13 = new Edge(4, "J");
        AdjacencyMatrix am = new AdjacencyMatrix(10);
        am.addEdge("A", e1);
        am.addEdge("A", e1);
        am.addEdge("A", e2);
        am.addEdge("A", e3);
        am.addEdge("B", e4);
        am.addEdge("C", e5);
        am.addEdge("D", e6);
        am.addEdge("E", e7);
        am.addEdge("E", e8);
        am.addEdge("F", e9);
        am.addEdge("F", e10);
        am.addEdge("G", e11);
        am.addEdge("H", e12);
        am.addEdge("H", e13);

        assertTrue(am.hasEdge("A", "C"));
    }

    //testing if an edge doesn't exist
    @Test
    void hasEdgeTest2() {
        Edge e1 = new Edge(2, "B");
        Edge e2 = new Edge(3, "C");
        Edge e3 = new Edge(5.5, "D");
        Edge e4 = new Edge(7, "E");
        Edge e5 = new Edge(3, "E");
        Edge e6 = new Edge(5, "F");
        Edge e7 = new Edge(5, "G");
        Edge e8 = new Edge(5.7, "H");
        Edge e9 = new Edge(4.4, "H");
        Edge e10 = new Edge(5, "I");
        Edge e11 = new Edge(4.3, "J");
        Edge e12 = new Edge(2.8, "I");
        Edge e13 = new Edge(4, "J");
        AdjacencyMatrix am = new AdjacencyMatrix(10);
        am.addEdge("A", e1);
        am.addEdge("A", e1);
        am.addEdge("A", e2);
        am.addEdge("A", e3);
        am.addEdge("B", e4);
        am.addEdge("C", e5);
        am.addEdge("D", e6);
        am.addEdge("E", e7);
        am.addEdge("E", e8);
        am.addEdge("F", e9);
        am.addEdge("F", e10);
        am.addEdge("G", e11);
        am.addEdge("H", e12);
        am.addEdge("H", e13);

        assertFalse(am.hasEdge("A", "H"));
    }

    @Test
    void printAdjacencyMatrix() {

        try {
            ReadFile fileRes = new ReadFile("Data.txt");
            Set<String> explored = new HashSet<>();
            for (String line : fileRes.getLines()) {
                String[] words = line.split("\\s+");
                explored.add(words[0]);
                explored.add(words[1]);
            }
            System.out.println(explored);
            AdjacencyMatrix am = new AdjacencyMatrix(explored.size());
            fileRes.addVertexToAdjacencyMatrixFromTxt("Data.txt", am);
            am.printAdjacencyMatrix();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    //Tests if the best first search algorithm prints correctly
    @Test
    void BFS() {
        try {
            ReadFile fileRes = new ReadFile("Data.txt");
            Set<String> explored = new HashSet<>();
            for (String line : fileRes.getLines()) {
                String[] words = line.split("\\s+");
                explored.add(words[0]);
                explored.add(words[1]);
            }
            AdjacencyMatrix am = new AdjacencyMatrix(explored.size());
            fileRes.addVertexToAdjacencyMatrixFromTxt("Data.txt", am);

            String actual = am.BFS("G");
            String expected = "[G, E, J, B, C, H, A, F, I, D]";
            assertEquals(expected, actual);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


    }
}