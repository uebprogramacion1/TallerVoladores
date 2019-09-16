package Modelo;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Despegando");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Aterrizar");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Volando");
	}



}
