package modelo;

public class Supergirl extends Kryptonian implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Despega para ayudar";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "\nAterriza como Superman";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "\nVuela con su capa";
	}
	
	public String proteger() {
		return "\nSu proposito el proteger a la tierra";
	}
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "\nTengo hambre";
	}
	

}
