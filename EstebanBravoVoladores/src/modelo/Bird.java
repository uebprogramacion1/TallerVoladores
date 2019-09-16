package modelo;

public class Bird extends Animal implements Flyer {
	
	
	private String buildNest;
	private String layEggs;
	
	
	
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "El ave procede a despegar";
	}
	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El ave procede a aterrizar";
	}
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El ave esta volando sobre el lago de tota";
	}
	
	public String  buildNeat() {
		return "El ave esta costruyendo un nido";
	}
	public String layEggs() {
		return"El ave esta poniendo huevos";
		
	}
	
	
	
	
	

}
