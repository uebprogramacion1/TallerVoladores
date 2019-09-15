package modelo;

public class World 
{
	private Superman superman = new Superman();
	private SeaPlane seaplane = new SeaPlane();
	private Helicopter helicopter = new Helicopter();
	private Bird bird = new Bird();
	
	public Superman getSuperman() {
		return superman;
	}
	public SeaPlane getSeaplane() {
		return seaplane;
	}
	public Helicopter getHelicopter() {
		return helicopter;
	}
	public Bird getBird() {
		return bird;
	}
	
	
}
