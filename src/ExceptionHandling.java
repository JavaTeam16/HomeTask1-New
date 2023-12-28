import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args) {
		
	}
    
    //Part4
    // Chaining Exceptions
    public void chainExceptions() {
        try {

        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace
            throw new RuntimeException("Error occurred", e); // Chain the exception
        }
    }
}