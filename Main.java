import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static <String> void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class ExceptionHandling {
        // Handling Multiple Exceptions
        public void handleMultipleExceptions() {
            try {
// Code that might throw multiple exceptions
                int x = 10 / 0; // Arithmetic exception
                String str = null;
                str.length(); // NullPointerException
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception occurred: " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception occurred: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("General exception occurred: " + e.getMessage());
            }
        }
        // Re-throwing Exceptions
        public void rethrowException(int x) throws IOException {
            if (x < 0) {
                throw new IOException("Input cannot be negative");
            }
// Code that might throw other exceptions
// ...
        }
        // Resource Management
        public void manageResources() {
            try (FileReader reader = new FileReader("data.txt");
                 BufferedReader bufferedReader = new BufferedReader(reader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
        // Chaining Exceptions
        public void chainExceptions() {
            try {
// Code that might throw exceptions
// ...
            } catch (Exception e) {
                e.printStackTrace(); // Print the stack trace
                throw new RuntimeException("Error occurred", e); // Chain the exception
            }
        }
    }
}