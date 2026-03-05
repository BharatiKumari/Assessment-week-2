import java.io.*;

public class ExceptionTypes {
    public static void main(String[] args) {
        // Checked Exception (Requires handling at compile time)
        try {
            FileReader file = new FileReader("non_existent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }

        // Unchecked Exception (Occurs at runtime)
        int data = 50 / 0; // ArithmeticException
    }
}
