package modelo;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public String takeOff() {
		return "El avión está despegando.";
	}

	@Override
	public String land() {
		return "El avión está aterrizando.";
	}

	@Override
	public String fly() {

		return "El avión está volando.";
	}

	@Override
	public String arrancar() {
		return "El avión arrancó.";
	}



}
