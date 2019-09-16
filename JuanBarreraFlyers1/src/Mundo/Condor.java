package Mundo;

public class Condor extends Animal implements Flyer{

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("No suelo volar");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Es mejor estar en tierra");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("La caza ilegal es peligrosa");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("La caceria es importante");
		
	}

}
