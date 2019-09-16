package modelo;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public String takeOff() {

		return "El avión despega";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El avión aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El avión vuela";
	}

}
