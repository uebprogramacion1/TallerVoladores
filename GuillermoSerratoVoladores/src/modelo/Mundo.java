package modelo;

public class Mundo {

	
	private Superman sup;
	private Ave av;
	private Hidroavion hid;
	private Helicoptero heli;
	private Automovil aut;
	private Murcielago mur;
	private JorEl jor;

	public Mundo() {
		sup = new Superman();
		av = new Ave();
		hid = new Hidroavion();
		heli = new Helicoptero();
		aut = new Automovil();
		mur = new Murcielago();
		jor = new JorEl();
	}

	public Superman getSup() {
		return sup;
	}

	public void setSup(Superman sup) {
		this.sup = sup;
	}

	public Ave getAv() {
		return av;
	}

	public void setAv(Ave av) {
		this.av = av;
	}

	public Hidroavion getHid() {
		return hid;
	}

	public void setHid(Hidroavion hid) {
		this.hid = hid;
	}

	public Helicoptero getHeli() {
		return heli;
	}

	public void setHeli(Helicoptero heli) {
		this.heli = heli;
	}

	public Automovil getAut() {
		return aut;
	}

	public void setAut(Automovil aut) {
		this.aut = aut;
	}

	public Murcielago getMur() {
		return mur;
	}

	public void setMur(Murcielago mur) {
		this.mur = mur;
	}

	public JorEl getJor() {
		return jor;
	}

	public void setJor(JorEl jor) {
		this.jor = jor;
	}

}
