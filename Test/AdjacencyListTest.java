import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;


class AdjacencyListTest {

    @Test
    void addEdge() {
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        AdjacencyList<String> AL = new AdjacencyList<>();
        AL.addVertex("A");

        assertTrue(AL.getMap().containsKey("A"));
    }


    @Test
    void removeVertex() {
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        AL.printAdjacencyList();


        int expected  = 2;
        int actual = AL.getMap().get("G").size();
        assertEquals(expected, actual);

    }

    //Testing if it can't find an Edge
    @Test
    void removeEdgeTest4() {
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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
        AL.printAdjacencyList();


        int expected  = 2;
        int actual = AL.getMap().get("G").size();
        assertEquals(expected, actual);

    }

    @Test
    void printAdjacencyList() {
        Edge<String> e1 = new Edge<String>(2, "B");
        Edge<String> e2 = new Edge<String>(3, "C");
        Edge<String> e3 = new Edge<String>(5.5, "D");
        Edge<String> e4 = new Edge<String>(7, "E");
        Edge<String> e5 = new Edge<String>(3, "E");
        Edge<String> e6 = new Edge<String>(5, "F");
        Edge<String> e7 = new Edge<String>(5, "G");
        Edge<String> e8 = new Edge<String>(5.7, "H");
        Edge<String> e9 = new Edge<String>(4.4, "H");
        Edge<String> e10 = new Edge<String>(5, "I");
        Edge<String> e11 = new Edge<String>(4.3, "J");
        Edge<String> e12 = new Edge<String>(2.8, "I");
        Edge<String> e13 = new Edge<String>(4, "J");
        AdjacencyList<String> AL = new AdjacencyList<>();
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

        String expected = "A has connections to: <B, 2.0>, <C, 3.0>, <D, 5.5>, \n" +
                "B has connections to: <A, 2.0>, <E, 7.0>, \n" +
                "C has connections to: <A, 3.0>, <E, 3.0>, \n" +
                "D has connections to: <A, 5.5>, <F, 5.0>, \n" +
                "E has connections to: <B, 7.0>, <C, 3.0>, <G, 5.0>, <H, 5.7>, \n" +
                "F has connections to: <D, 5.0>, <H, 4.4>, <I, 5.0>, \n" +
                "G has connections to: <E, 5.0>, <J, 4.3>, \n" +
                "H has connections to: <E, 5.7>, <F, 4.4>, <I, 2.8>, <J, 4.0>, \n" +
                "I has connections to: <F, 5.0>, <H, 2.8>, \n" +
                "J has connections to: <G, 4.3>, <H, 4.0>,";
    }
}