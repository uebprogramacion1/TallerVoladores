package Modelo;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Abriendo las alas");
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Llegando al arbol");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Volando en los aires");
	}

	public void buildNest() {
		
		System.out.println("Construyendo nido");
		
	}
	
	public void layEggs() {
		
		System.out.println("Poner huevos");
	}
	
	public void eat() {
		
		System.out.println("Comiendo");
	}

}
