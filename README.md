public class ExceptionHandling { 
 public class Main {    public static void main(String[] args) { 
        System.out.println("Hello world!");    } 
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