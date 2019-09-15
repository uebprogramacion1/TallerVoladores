package Modelo;

public class Airplane extends Vehicle implements Flyer  {

	@Override
	public String takeOff() {
		
		return "Airplane taking off";
	}

	@Override
	public String land() {
		return " In  Land ";
	}

	
	@Override
	public String fly() {
		return "Airplane in flight";
	}

}
