package modelo;

public class Helicopter extends Airplane {
	public String takeOff() {

		return "El helicoptero despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El helicoptero aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El helicoptero vuela";
	}

}
