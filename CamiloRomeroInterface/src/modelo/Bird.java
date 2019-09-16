package modelo;

public class Bird extends Animal implements Flyer{

	public String layEggs() {
		return "el ave puso huevos";
	}

	public String buildNest() {
		return "el ave construye su nido";
	}

	public String land() {
		return "el ave aterrizo";
	}

	public String takeOff() {
		return "el ave despego";
	}

	public String fly() {
		return "el ave esta volando";
	}

	public String eat() {
		return "el ave come";
	}

}
