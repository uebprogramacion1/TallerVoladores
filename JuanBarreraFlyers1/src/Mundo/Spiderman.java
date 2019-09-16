package Mundo;

public class Spiderman extends Animal implements Flyer{

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Es hora de ser un heroe");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Camino como cualquier ser");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("La telaraña es vital");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Que delicia, una mosca ");
		
	}

}
