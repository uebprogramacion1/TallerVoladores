package Mundo;

public class Superman extends Animal implements Flyer{

	@Override
	public void eat() {
	System.out.println("No como");
		
	}
	public void takeOff(){
		System.out.println("No me quito");
	}
	public void land(){
		System.out.println("No soy de la tierra");
	}
	public void fly(){
		System.out.println("Vuelo");
	}
	public void leapBuilding(){
		System.out.println("Salto edificios");
		
	}
	public void stopBullet(){
		System.out.println("Soy invencible");
	}
}
