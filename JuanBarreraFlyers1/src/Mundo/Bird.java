package Mundo;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Elevarse sobre edificios");
	}

	@Override
	public void land() {
		
		System.out.println("La tierra tiene muchos peligros");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		
		System.out.println("Me encanta volar");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		
		System.out.println("Alimento preferido gusanos");
		// TODO Auto-generated method stub
		
	}
	
	public void buildNest(){
		System.out.println("Supervivencia de la especie");
		
	}
	public void layEggs(){
		System.out.println("Incubar huevos");
	}

}
