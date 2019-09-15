package modelo;

public class Cometa implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Despega con ayuda";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return"\nAterriza cayendo en picada";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "\nVuela gracias al viento";
	}

}
