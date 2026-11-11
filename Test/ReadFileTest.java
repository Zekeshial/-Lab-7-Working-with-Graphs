import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void addVertexToAdjacencyListFromTxt() {
        AdjacencyList AL = new AdjacencyList();
        try {
            ReadFile fileRes = new ReadFile("Data.txt");
            fileRes.addVertexToAdjacencyListFromTxt("Data.txt", AL);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        assertTrue(AL.getMap().containsKey("A"));
    }

    @Test
    void addVertexToAdjacencyMatrixFromTxt() {

        try {
            ReadFile fileRes = new ReadFile("Data.txt");
            Set<String> explored = new HashSet<>();
            for (String line : fileRes.getLines()) {
                String[] words = line.split("\\s+");
                explored.add(words[0]);
                explored.add(words[1]);
            }
            AdjacencyMatrix am = new AdjacencyMatrix(explored.size());
            assertTrue(fileRes.addVertexToAdjacencyMatrixFromTxt("Data.txt", am));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    @Test
    void addVertexToAdjacencyMatrixFromTxt2() {

        try {
            ReadFile fileRes = new ReadFile("DataTest.txt");
            Set<String> explored = new HashSet<>();
            for (String line : fileRes.getLines()) {
                String[] words = line.split("\\s+");
                explored.add(words[0]);
                explored.add(words[1]);
            }


            AdjacencyMatrix am = new AdjacencyMatrix(explored.size());
            assertTrue(fileRes.addVertexToAdjacencyMatrixFromTxt("DataTest.txt", am));

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}