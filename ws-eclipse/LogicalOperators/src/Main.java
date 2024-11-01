import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		/* Logical Operators = Used to connect two or more expressions
		 * 
		 * 								&& = (AND) - both conditions must be true
		 * 								|| = (OR) - either conditions must be true (one of them)
		 * 								! = (NOT) - reverses boolean value of condition
		 */
		
		// -------------------------------- Example 1 --------------------------------

		int temp = 15;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
				

		// -------------------------------- Example 2 --------------------------------

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("YOu are still playing the game *pew pew*");
		}
		else {
			System.out.println("You quit the game");
		}
		
		scanner.close();

	}
}
