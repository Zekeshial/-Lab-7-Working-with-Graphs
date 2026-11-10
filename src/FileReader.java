import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {

    private ArrayList<String> lines;

    private FileReader() {}

    public FileReader(String fname) throws FileNotFoundException {
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


}
