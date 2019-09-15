package modelo;

public class Mundo {

	private Airplane air;
	private Bird bi;
	private Superman su;
	private SeaPlane sea;
	private Helicopter he;
	private SuperGirl sgirl;
	private Drone dro;
	private Dirigible di;
	
	public Mundo() {
		
		air = new Airplane();
		bi = new Bird();
		su = new Superman();
		sea = new SeaPlane();
		he = new Helicopter();
		sgirl = new SuperGirl();
		dro = new Drone();
		di = new Dirigible();
		
	}

	public Dirigible getDi() {
		return di;
	}

	public void setDi(Dirigible di) {
		this.di = di;
	}

	public Drone getDro() {
		return dro;
	}

	public void setDro(Drone dro) {
		this.dro = dro;
	}

	public SuperGirl getSgirl() {
		return sgirl;
	}

	public void setSgirl(SuperGirl sgirl) {
		this.sgirl = sgirl;
	}

	public Airplane getAir() {
		return air;
	}

	public void setAir(Airplane air) {
		this.air = air;
	}

	public Bird getBi() {
		return bi;
	}

	public void setBi(Bird bi) {
		this.bi = bi;
	}

	public Superman getSu() {
		return su;
	}

	public void setSu(Superman su) {
		this.su = su;
	}

	public SeaPlane getSea() {
		return sea;
	}

	public void setSea(SeaPlane sea) {
		this.sea = sea;
	}

	public Helicopter getHe() {
		return he;
	}

	public void setHe(Helicopter he) {
		this.he = he;
	}
}
