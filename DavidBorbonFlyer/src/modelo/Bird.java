package modelo;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return  "salgo del nido";
		
	}

	@Override
	public String land() {
		return "vivo en los arboles";
		
	}

	@Override
	public String fly() {
		return "vuelo lento :c";
		
	}
	public void buildNest() {
		
	}
	public void layEggs()
	{
		
	}

	@Override
	public String eat() {
		return "como gusanos";
		
	}
	

}
