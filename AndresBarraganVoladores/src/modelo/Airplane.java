package modelo;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public String takeOff() {

		return "El avi�n despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El avi�n aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El avi�n vuela";
	}

}
