package modelo;

public class Mundo {

	private AirPlane air;
	private Bird bird;
	private Helicopter hel;
	private Kryptonian kryp;
	private SeaPlane sea;
	private Superman sup;
	private Paloma pal;
	private HijoSuperman hjs;
	
	
	public Mundo() {
		air = new AirPlane();
		bird = new Bird();
		hel= new Helicopter();
		kryp= new Kryptonian();
		sea= new SeaPlane();
		sup= new Superman();
		pal = new Paloma();
		hjs = new HijoSuperman();
	}


	public Paloma getPal() {
		return pal;
	}


	public void setPal(Paloma pal) {
		this.pal = pal;
	}


	public HijoSuperman getHjs() {
		return hjs;
	}


	public void setHjs(HijoSuperman hjs) {
		this.hjs = hjs;
	}


	public AirPlane getAir() {
		return air;
	}


	public void setAir(AirPlane air) {
		this.air = air;
	}


	public Bird getBird() {
		return bird;
	}


	public void setBird(Bird bird) {
		this.bird = bird;
	}


	public Helicopter getHel() {
		return hel;
	}


	public void setHel(Helicopter hel) {
		this.hel = hel;
	}


	public Kryptonian getKryp() {
		return kryp;
	}


	public void setKryp(Kryptonian kryp) {
		this.kryp = kryp;
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

	

}
