package modelo;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "El avion despegara del Aeropuerto el dorado";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El avion esta aterrizando en el Aeropuerto de rio negro";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El avion esta volando por la ciudad de medellin";
	}

	
	
	

	
	
	

}
