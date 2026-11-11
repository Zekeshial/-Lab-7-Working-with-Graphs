import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Adjacency List and Matrix operator program!\n");
        System.out.println("In this program you will be prompted to give a text document and the program will create that text document into a adjacency list and adjacency matrix.\n" +
                "It will display both of the data structures and how they are organized and then it will run a depth first search over that data structure from a point you select.\n" +
                "The txt document has to be in the format of (Vertex as a letter + Vertex its connected to + weight of that connection)\n" +
                "An example is shown: A B 2\n" +
                "'A' represents the vertex 'B' the connecting vertex and '2' the weight.\n" +
                "The spaces between each variable is necessary for the program to run.\n" +
                "An example of what a full proper document will be listed below.\n" +
                        "A B 2\n" +
                        "A C 3\n" +
                        "A D 5.5\n" +
                        "B E 7\n" +
                        "C E 3\n" +
                        "D F 5\n" +
                        "E G 5\n" +
                        "E H 5.7\n" +
                        "F H 4.4\n" +
                        "F I 5\n" +
                        "G J 4.3\n" +
                        "H I 2.8\n" +
                        "H J 4"
                );
        System.out.println();
        System.out.println("What is the text document you wish to go over: ");

        String userInput = scanner.nextLine().toLowerCase();

        int sizeOfDataSet = 0;
        try {
            ReadFile fileRes = new ReadFile("DataTest.txt");
            Set<String> explored = new HashSet<>();
            for (String line : fileRes.getLines()) {
                String[] words = line.split("\\s+");
                explored.add(words[0]);
                explored.add(words[1]);
            }
            char largest = Character.MIN_VALUE;
            for (String letter : explored) {
                if (letter.charAt(0) > largest) {
                    largest = letter.charAt(0);
                }
            }

            largest = Character.toUpperCase(largest);

            sizeOfDataSet = largest - 'A' + 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }


        AdjacencyList al = new AdjacencyList();
        AdjacencyMatrix am = new AdjacencyMatrix(sizeOfDataSet);

        try {
            ReadFile fileRes = new ReadFile(userInput);
            fileRes.addVertexToAdjacencyListFromTxt(userInput, al);
            fileRes.addVertexToAdjacencyMatrixFromTxt(userInput,am);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        System.out.println();
        System.out.println("This is what the Adjacency list looks like: ");
        al.printAdjacencyList();

        System.out.println();

        System.out.println("This is what the Adjacency Matrix looks like: ");
        am.printAdjacencyMatrix();

        System.out.println();
        System.out.println("What point in the data do you wish to start the depth first search (please enter a letter): ");

        String userInput2 = scanner.nextLine().toUpperCase();

        System.out.println("Adjacency list result: ");
        System.out.println(al.BFS(userInput2));

        System.out.println("Adjacency matrix result: ");
        System.out.println(am.BFS(userInput2));


        System.out.println("Thank you for using the Adjacency List and Matrix operator program.");
        System.out.println("Goodbye.");
    }
}
