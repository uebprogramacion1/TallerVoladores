package Modelo;

public class Mundo extends AirPlane{

	private Bird bird;
	private SuperMan superman;
	private SeaPlane seaplane;
	private Helicopter helicopter;
	
	public Mundo() {
		
		bird = new Bird();
		superman = new SuperMan();
		seaplane = new SeaPlane();
		helicopter = new Helicopter();
		
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public SuperMan getSuperman() {
		return superman;
	}

	public void setSuperman(SuperMan superman) {
		this.superman = superman;
	}

	public SeaPlane getSeaplane() {
		return seaplane;
	}

	public void setSeaplane(SeaPlane seaplane) {
		this.seaplane = seaplane;
	}

	public Helicopter getHelicopter() {
		return helicopter;
	}

	public void setHelicopter(Helicopter helicopter) {
		this.helicopter = helicopter;
	}

}
