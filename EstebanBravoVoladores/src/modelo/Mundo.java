package modelo;

public class Mundo {
	
	Airplane air;
	Animal ani;
	Bird bi;
	Helicopter heli;
	Kryptonian kry;
	SeaPlane seap;
	Superman supern;
	Vehicle vehi;
	
	
	public Mundo() {
		
		air = new Airplane();
		ani = new Animal();
		bi = new Bird();
		heli = new Helicopter();
		kry = new Kryptonian();
		seap = new SeaPlane();
		supern = new Superman();
	    vehi = new Vehicle();
		
	}


	public Airplane getAir() {
		return air;
	}


	public void setAir(Airplane air) {
		this.air = air;
	}


	public Animal getAni() {
		return ani;
	}


	public void setAni(Animal ani) {
		this.ani = ani;
	}


	public Bird getBi() {
		return bi;
	}


	public void setBi(Bird bi) {
		this.bi = bi;
	}


	public Helicopter getHeli() {
		return heli;
	}


	public void setHeli(Helicopter heli) {
		this.heli = heli;
	}


	public Kryptonian getKry() {
		return kry;
	}


	public void setKry(Kryptonian kry) {
		this.kry = kry;
	}


	public SeaPlane getSeap() {
		return seap;
	}


	public void setSeap(SeaPlane seap) {
		this.seap = seap;
	}


	public Superman getSupern() {
		return supern;
	}


	public void setSupern(Superman supern) {
		this.supern = supern;
	}


	public Vehicle getVehi() {
		return vehi;
	}


	public void setVehi(Vehicle vehi) {
		this.vehi = vehi;
	}
	
	
	
	

}
