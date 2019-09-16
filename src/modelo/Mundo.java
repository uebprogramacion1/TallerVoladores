package modelo;

public class Mundo {
	
	private Airplane air;
	private Bird bir;
	private Helicopter hel;
	private SeaPlane sea;
	private Superman sup;
	private Gallina gal;
	private Perro per;
	private Moto mot;
	
	public Mundo() {
		air = new Airplane();
		bir = new Bird();
		hel = new Helicopter();
		sea = new SeaPlane();
		sup = new Superman();
		gal = new Gallina();
		per = new Perro();
		mot = new Moto();	
	}
	
	
	public Airplane getAir() {
		return air;
	}

	public void setAir(Airplane air) {
		this.air = air;
	}

	public Bird getBir() {
		return bir;
	}

	public void setBir(Bird bir) {
		this.bir = bir;
	}

	public Helicopter getHel() {
		return hel;
	}

	public void setHel(Helicopter hel) {
		this.hel = hel;
	}

	public SeaPlane getSea() {
		return sea;
	}

	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}

	public Superman getSup() {
		return sup;
	}

	public void setSup(Superman sup) {
		this.sup = sup;
	}

	public Gallina getGal() {
		return gal;
	}

	public void setGal(Gallina gal) {
		this.gal = gal;
	}

	public Perro getPer() {
		return per;
	}

	public void setPer(Perro per) {
		this.per = per;
	}

	public Moto getMot() {
		return mot;
	}

	public void setMot(Moto mot) {
		this.mot = mot;
	}
	
	
	
}
