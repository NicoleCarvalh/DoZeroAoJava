
public class Main {

	public static void main(String[] args) {

		// 					Object = an instance of a class that may contain ATTRIBUTES and METHODS
		// 							 Example: Phone, Desk, Computer, Coffee Cup
		// 							 You can use it to imitate objects in the real world - anything really
		//							 The class acts as a blueprint

		
		// Create your object -> our object Car is in the Car class
		
		// Create an instance of your object
		Car car = new Car();
		
		System.out.println(car.color);
		System.out.println(car.make);
		
		// Perform method
		car.drive();
		
		// Create another car
		Car myOtherCar = new Car();
		
		System.out.println(myOtherCar.color);
	}
	

}
