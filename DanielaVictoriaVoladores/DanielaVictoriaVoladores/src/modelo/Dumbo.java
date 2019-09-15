package modelo;

public class Dumbo extends Animal implements Flyer{

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Despega con ayuda de su plumita";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "\nAterriza con sus patas";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "\nVuela con sus orejas";
	}
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "\nLe gustan los cacahuates";
	}
	
	public String amar() {
		return"\nElefante bebe, hermosooo";
	}

}
