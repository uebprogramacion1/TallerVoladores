package modelo;

public class Mundo {
	private Airplane a;
	private Animal m;
	private Bird b;
	private Flyer f;
	private Helicopter h;
	private Kryptonian k;
	private SeaPlane s;
	private Superman sm;
	private Vehicle run;

	public Mundo ()
	{
		h= new Helicopter();
		k= new Kryptonian();
		s= new SeaPlane();
		sm= new Superman();
		run= new Vehicle();
		b= new Bird();

	}

	public Airplane getA() {
		return a;
	}

	public void setA(Airplane a) {
		this.a = a;
	}

	public Animal getM() {
		return m;
	}

	public void setM(Animal m) {
		this.m = m;
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
	}

	public Flyer getF() {
		return f;
	}

	public void setF(Flyer f) {
		this.f = f;
	}

	public Helicopter getH() {
		return h;
	}

	public void setH(Helicopter h) {
		this.h = h;
	}

	public Kryptonian getK() {
		return k;
	}

	public void setK(Kryptonian k) {
		this.k = k;
	}

	public SeaPlane getS() {
		return s;
	}

	public void setS(SeaPlane s) {
		this.s = s;
	}

	public Superman getSm() {
		return sm;
	}

	public void setSm(Superman sm) {
		this.sm = sm;
	}

	public Vehicle getRun() {
		return run;
	}

	public void setRun(Vehicle run) {
		this.run = run;
	}

}
