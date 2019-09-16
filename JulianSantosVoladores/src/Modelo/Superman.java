package Modelo;

public class Superman implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Volando para salvar el mundo");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Volando para el planeta tierra");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Volando");
	}
	
	public void leapBulding() {
		System.out.println("Escalando edificios");
	}

	public void stopBullet() {
		System.out.println("Esquivando balas");
	}

	public void eat() {
		System.out.println("Comiendo");
	}


	


}
