package githubTask1New;
public class exceptionHandeling {
//Part 1
	 @SuppressWarnings("null")
	public void handleMultipleExceptions() {
	        try {
// Code that might throw multiple exceptions
	            @SuppressWarnings("unused")
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
	 
}


 
