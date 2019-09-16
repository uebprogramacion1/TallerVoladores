package modelo;

public class Mundo {

	private Flyer flyer;
	private Animal animal;
	private Kryptonian krypt;
	private Vehicle vehicle;
	private Bird bird;
	private Superman superman;
	private Airplane airplane;
	private SeaPlane seaplane;
	private Helicopter heli;

	public Mundo() {
		animal = new Animal();
		krypt = new Kryptonian();
		vehicle = new Vehicle();
		bird = new Bird();
		superman = new Superman();
		airplane = new Airplane();
		seaplane = new SeaPlane();
		heli = new Helicopter();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Kryptonian getKrypt() {
		return krypt;
	}

	public void setKrypt(Kryptonian krypt) {
		this.krypt = krypt;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Bird getBird() {
		return bird;
	}

	public void setBird(Bird bird) {
		this.bird = bird;
	}

	public Superman getSuperman() {
		return superman;
	}

	public void setSuperman(Superman superman) {
		this.superman = superman;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public SeaPlane getSeaplane() {
		return seaplane;
	}

	public void setSeaplane(SeaPlane seaplane) {
		this.seaplane = seaplane;
	}

	public Helicopter getHeli() {
		return heli;
	}

	public void setHeli(Helicopter heli) {
		this.heli = heli;
	}

}
