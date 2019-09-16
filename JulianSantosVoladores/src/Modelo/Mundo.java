package Modelo;

public class Mundo {
	
	private Airplane a;
	
	private Animal an;
	
	private Bird b;
	
	private Helicopter h;
	
	private Kryptonian k;
	
	private SeaPlane s;
	
	private Superman su;
	
	private Vehicle v;
	
	public Mundo() {
		
		a = new Airplane();
		
		an = new Animal();
		
		b = new Bird();
		
		h = new Helicopter();
		
		k = new Kryptonian();
		
		s = new SeaPlane();
		
		su = new Superman();
		
		v = new Vehicle();
	}

	public Airplane getA() {
		return a;
	}

	public void setA(Airplane a) {
		this.a = a;
	}

	public Animal getAn() {
		return an;
	}

	public void setAn(Animal an) {
		this.an = an;
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
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

	public Superman getSu() {
		return su;
	}

	public void setSu(Superman su) {
		this.su = su;
	}

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	

}
