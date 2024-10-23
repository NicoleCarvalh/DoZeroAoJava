
interface Fan {
	
	void turnOn();
	String desligar();
}

public class MondialFan implements Fan {
	
	public void turnOn() {
		System.out.println("Ligou");
	}
	
	public String desligar() {
		return "";
	}
}

class MondialV2Fan extends MondialFan{
	
	@Override
	public void turnOn() {
		System.out.println("Aquecendo motores");
		System.out.println("Ligando");
	}
}
