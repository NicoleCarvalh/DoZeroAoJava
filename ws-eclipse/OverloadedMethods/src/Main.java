
public class Main {

	public static void main(String[] args) {
		
		// Overloaded Methods = methods that share the same name, but have different parameters
		//						Method name + parameters = method signature
		
		//int x = add(1, 2) -> does not work because it doesn't match any of the methods
		
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,3));
		System.out.println(add(1,2,3,3,3));
		System.out.println(add(1.7,2.8,3.9,3.4));

	}
	
	
	static int add(int a, int b, int c) {
		return a + b;
	}
	
	static int add(int a, int b, int c, int d) {
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d, int e) {
		return a + b + c + d;
	}
	
	// Works changing data types too!
	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}

}
