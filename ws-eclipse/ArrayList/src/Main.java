import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList = a resizable array.
		//			   Elements can be added and removed after compilation phase
		//			   Stoes only reference data types (wrapper classes ONLY)
		//     		   We use .size() method, instead of .length()
		//   		   We retrieve an element with .get()
		
		ArrayList<String> food = new ArrayList<String>();
		
		// Adding values to ArrayList
		
		food.add("Pizza");
		food.add("Hot Dog");
		food.add("Pineapple");
		
		// Replace values
		food.set(0, "Sushi");
		
		food.remove(2);
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}

	}

}
