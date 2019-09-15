package modelo;

public class Mundo {

	private Vehicle veh;
	private Airplane air;
	private SeaPlane sea;
	private Helicopter hel;
	private Bird bird;
	private Kryptonian kry;
	private Superman sman;
	private Supergirl sgirl;
	private Dumbo dumbo;
	private Cometa com;

	public Vehicle getVeh() {
		return veh;
	}
	public void setVeh(Vehicle veh) {
		this.veh = veh;
	}
	public Airplane getAir() {
		return air;
	}
	public void setAir(Airplane air) {
		this.air = air;
	}
	public SeaPlane getSea() {
		return sea;
	}
	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}
	public Helicopter getHel() {
		return hel;
	}
	public void setHel(Helicopter hel) {
		this.hel = hel;
	}
	public Bird getBird() {
		return bird;
	}
	public void setBird(Bird bird) {
		this.bird = bird;
	}
	public Kryptonian getKry() {
		return kry;
	}
	public void setKry(Kryptonian kry) {
		this.kry = kry;
	}
	public Superman getSman() {
		return sman;
	}
	public void setSman(Superman sman) {
		this.sman = sman;
	}
	public Supergirl getSgirl() {
		return sgirl;
	}
	public void setSgirl(Supergirl sgirl) {
		this.sgirl = sgirl;
	}
	public Dumbo getDumbo() {
		return dumbo;
	}
	public void setDumbo(Dumbo dumbo) {
		this.dumbo = dumbo;
	}
	public Cometa getCom() {
		return com;
	}
	public void setCom(Cometa com) {
		this.com = com;
	}

	public Mundo() {
		veh = new Vehicle();
		air = new Airplane();
		sea = new SeaPlane();
		hel = new Helicopter();
		bird = new Bird();
		kry = new Kryptonian();
		sman = new Superman();
		sgirl = new Supergirl();
		dumbo = new Dumbo();
		com = new Cometa(); 
	}

}
