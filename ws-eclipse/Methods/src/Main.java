
public class Main {

	public static void main(String[] args) {
		
		String name = "Freddie";
		
		// Method = a block of code that is executed whenever it is called upon
		
		hello(name);
		
		// Returning a value
		
		int x = 1;
		int y = 3;
		
		int result = add(x,y);
		
		System.out.println(result);
		
		// or
		
		System.out.println(add(x,y));
		
	}
	
	// Using a parameter requires the arguments' type
	static void hello(String name) {
		System.out.println("Hello " +name);
	}
	
	// If we are returning the value, we need to list the data type of the value we are going to return
	static int add(int a, int b) {
		
		return a + b;
		
	}
}
