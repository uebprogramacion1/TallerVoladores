package modelo;

public class Superman extends Kryptonian implements Flyer {
	
	private String leapBuilding;
	private String stopBullet;
	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Superman esta volando";
	}
	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Superman va a aterrizar en Cartagena";
	}
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Superman esta volando sobre Bogota y esta buscando a su perro";
	}
	
}
