package Demo;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		Demo();
		
	}
	
	public static void Demo() {
try {
			
			System.out.println("Hello World...");
			int i = 1/0;
			System.out.println("Completed.");
			
		}
		catch(Exception exp) {
			
			System.out.println("I'm inside catch block");
			System.out.println("Message is : "+exp.getMessage());
			System.out.println("Cause is : "+exp.getCause());
			exp.printStackTrace();
			
		}
		finally {
			System.out.println("I'm inside finally block");
		}
	}

}
