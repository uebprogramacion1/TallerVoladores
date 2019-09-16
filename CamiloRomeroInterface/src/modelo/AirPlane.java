package modelo;

public class AirPlane extends Vehicle implements Flyer {

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "a despegado";
	}

	public String land() {
		// TODO Auto-generated method stub
		return "a aterrizado";
	}

	public String fly() {
		// TODO Auto-generated method stub
		return "volando";
	}	
	
}
