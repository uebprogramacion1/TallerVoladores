package modelo;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return "El pajaro despegó.";
	}

	@Override
	public String land() {
		return "El pajaro está aterrizando";
	}

	@Override
	public String fly() {
		return "El pajaro está volando";
	}
	
	@Override
	public String eat() {
		return super.eat();
	}
	
	public String buildNest() {
		return "El pajaro construyo un nido";
	}
	public String layEggs() {
		return "El pajaro puso huevos";
	}
	

}
