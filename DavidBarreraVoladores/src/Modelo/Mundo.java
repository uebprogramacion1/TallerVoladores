package Modelo;

public class Mundo {
	private Vehicle Veh;
	private Airplane Air;
	private SeaPlane Spla;
	private Helicopter Hel;
	private Bird Bir;
	private Animal Anim;
	private Krytonian Kry;
	private Superman Supe;

	public Mundo() {
		Veh = new Vehicle();
		Air = new Airplane();
		Spla = new SeaPlane();
		Hel = new Helicopter();
		Bir = new Bird();
		Anim = new Animal();
		Kry = new Krytonian();
		Supe = new Superman();

	}

	public Vehicle getVeh() {
		return Veh;
	}

	public void setVeh(Vehicle veh) {
		Veh = veh;
	}

	public Airplane getAir() {
		return Air;
	}

	public void setAir(Airplane air) {
		Air = air;
	}

	public SeaPlane getSpla() {
		return Spla;
	}

	public void setSpla(SeaPlane spla) {
		Spla = spla;
	}

	public Helicopter getHel() {
		return Hel;
	}

	public void setHel(Helicopter hel) {
		Hel = hel;
	}

	public Bird getBir() {
		return Bir;
	}

	public void setBir(Bird bir) {
		Bir = bir;
	}

	public Animal getAnim() {
		return Anim;
	}

	public void setAnim(Animal anim) {
		Anim = anim;
	}

	public Krytonian getKry() {
		return Kry;
	}

	public void setKry(Krytonian kry) {
		Kry = kry;
	}

	public Superman getSupe() {
		return Supe;
	}

	public void setSupe(Superman supe) {
		Supe = supe;
	}
	

}