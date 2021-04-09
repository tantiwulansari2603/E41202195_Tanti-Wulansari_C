/**
 *
 * @author Tanti
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Tanti");
        theTree.insert(25, "Wulan");
        theTree.insert(75, "Sari");
        theTree.insert(12, "Polije");
        theTree.insert(37, "Jember");
        theTree.insert(43, "Indo");
        theTree.insert(30, "Love");
        theTree.insert(33, "God");
        theTree.insert(87, "Aziza");
        theTree.insert(93, "Dila");
        theTree.insert(97, "Deni");
        
            while (true) {
                System.out.print("Enter first letter of show, insert, find, delete, or traverse : ");
                int choice = getChar();
                    switch (choice) {
                        case 's':
                            theTree.displayTree();
                            break;
                        case 'i':
                            System.out.print("Enter value and data to insert : ");
                            value = getInt();
                            data = getString();
                            theTree.insert(value, data);
                            break;
                        case 'f':
                            System.out.print("Enter value to find : ");
                            value = getInt();
                            Node found = theTree.find(value);
                                if (found != null) {
                                    System.out.print("Found : ");
                                    found.displayNode();
                                    System.out.print("");
                                } else {
                                    System.out.println("Could not find " + value);
                                }
                        break;
                        case 'd':
                            System.out.print("Enter value to delete : ");
                            value = getInt();
                            boolean didDelete = theTree.delete(value);
                                if (didDelete) {
                                    System.out.println("Delete " + value);
                                } else {
                                    System.out.println("Could not delete " + value);
                                }
                        break;
                        case 't':
                            System.out.print("Enter type 1, 2, or 3 : ");
                            value = getInt();
                            theTree.traverse(value);
                        break;
                        default:
                           System.out.println("Invalid Entry");
                    }
            }
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    private static int getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    private static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
