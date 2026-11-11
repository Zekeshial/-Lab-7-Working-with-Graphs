import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class ReadFile {

    private ArrayList<String> lines;

    private ReadFile() {}

    public ReadFile(String fname) throws FileNotFoundException {
        if (!doReadFile(fname)) {
            throw new FileNotFoundException("Error reading file: " + fname);
        }
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public Boolean doReadFile(String fname) {
        lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fname))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return false;
    }


    /**
     * Adds the data from a txt document into an Adjacency List
     * @param dataToRead the data to read
     * @param map the list you wish to add it to
     * @return If the method worked or not as a boolean true if yes false if no
     */
    public boolean addVertexToAdjacencyListFromTxt(String dataToRead, AdjacencyList map) {
        try {
            ReadFile fileRes = new ReadFile(dataToRead);
            ArrayList<String> lines = fileRes.getLines();

            for (String line: lines) {
                String[] words = line.split("\\s+");
                String vertex = words[0];
                Edge edge = new Edge(Double.parseDouble(words[2]), words[1]);
                map.addEdge(vertex,edge);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
        return true;
    }
    /**
     * Adds the data from a txt document into an Adjacency matrix
     * @param dataToRead the data to read
     * @param map the matrix you wish to add it to
     * @return If the method worked or not as a boolean true if yes false if no
     */
    public boolean addVertexToAdjacencyMatrixFromTxt(String dataToRead, AdjacencyMatrix map) {
        try {
            ReadFile fileRes = new ReadFile(dataToRead);
            ArrayList<String> lines = fileRes.getLines();

            for (String line: lines) {
                String[] words = line.split("\\s+");
                String vertex = words[0];
                Edge edge = new Edge(Double.parseDouble(words[2]), words[1]);
                map.addEdge(vertex,edge);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
        return true;
    }


}
