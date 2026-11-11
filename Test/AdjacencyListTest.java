import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;


class AdjacencyListTest {

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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.printAdjacencyList();
        assertTrue(AL.getMap().get("A").contains(e3));

    }

    @Test
    void addEdgeTest2() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.addEdge("A", e1);

        assertEquals(1, Collections.frequency(AL.getMap().get("A"), e1));

    }

    @Test
    void addVertex() {
        AdjacencyList AL = new AdjacencyList();
        AL.addVertex("A");

        assertTrue(AL.getMap().containsKey("A"));
    }


    @Test
    void removeVertex() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.removeVertex("A");

        assertFalse(AL.getMap().containsKey("A"));
    }

    @Test
    void removeVertexTest2() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);
        AL.removeVertex("A");

        int actual = AL.getMap().get("B").size();
        int expected = 1;


        assertEquals(expected, actual);
    }

    //testing if edge is removed from the vertex it is connected to
    @Test
    void removeEdge() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.removeEdge("G", e11);


        int expected  = 1;
        int actual = AL.getMap().get("J").size();
        assertEquals(expected, actual);

    }

    //Testing if edge is removed from selected vertex
    @Test
    void removeEdgeTest2() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.removeEdge("G", e11);


        int expected  = 1;
        int actual = AL.getMap().get("G").size();
        assertEquals(expected, actual);

    }


    //Testing if it can't find an Edge even if the vertex is the same value but the weight value is different.
    @Test
    void removeEdgeTest3() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.removeEdge("G", e4);


        int expected  = 2;
        int actual = AL.getMap().get("G").size();
        assertEquals(expected, actual);

    }

    //Testing if it can't find an Edge
    @Test
    void removeEdgeTest4() {
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
        AdjacencyList AL = new AdjacencyList();
        AL.addEdge("A", e1);
        AL.addEdge("A", e2);
        AL.addEdge("A", e3);
        AL.addEdge("B", e4);
        AL.addEdge("C", e5);
        AL.addEdge("D", e6);
        AL.addEdge("E", e7);
        AL.addEdge("E", e8);
        AL.addEdge("F", e9);
        AL.addEdge("F", e10);
        AL.addEdge("G", e11);
        AL.addEdge("H", e12);
        AL.addEdge("H", e13);

        AL.removeEdge("G", e1);

        int expected  = 2;
        int actual = AL.getMap().get("G").size();
        assertEquals(expected, actual);

    }

    //Tests if the best first search algorithm prints correctly
    @Test
    void BFS() {
        AdjacencyList AL = new AdjacencyList();
        try {
            ReadFile fileRes = new ReadFile("Data.txt");
            fileRes.addVertexToAdjacencyListFromTxt("Data.txt", AL);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        String actual = AL.BFS("G");
        String expected = "[G, E, J, B, C, H, A, F, I, D]";

        assertEquals(expected, actual);
    }
}