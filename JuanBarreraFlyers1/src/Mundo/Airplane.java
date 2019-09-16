package Mundo;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Despega");
		
	}

	@Override
	public void land() {
		System.out.println("Cruzando por tierra");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Volando sobre el mar");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void necesitoReparacion() {
		System.out.println("Solo piezas finas");
		// TODO Auto-generated method stub
		
	}

}
