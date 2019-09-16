package modelo;

public class Bird extends Animal implements Flyer {

	public String takeOff() {

		return "El pajaro despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El pajaro aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El pajaro vuela";
	}

	public String buildNest() {
		return "El pajaro construye su nido";

	}

	public String layEggs() {
		return "El pajaro pone huevos";
	}

}
