import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ExceptionHandling {
	public static void main(String[] args) {
		
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

}
}