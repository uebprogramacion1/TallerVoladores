package modelo;

public class Mundo {
	private Helicoptero hel;
	private Hidroavión hid;
	private Superman sup;
	private Ave av;
	private Aguila agu;
	private CardenalNorteño can;
	private Pterodactilo pte;

	public Mundo() {
		hel = new Helicoptero();
		hid = new Hidroavión();
		sup = new Superman();
		av = new Ave();
		agu = new Aguila();
		can = new CardenalNorteño();
		pte = new Pterodactilo();
		
}
public Helicoptero getHel() {
	return hel;
}
public void setHel(Helicoptero hel) {
	this.hel = hel;
}
public Hidroavión getHid() {
	return hid;
}
public void setHid(Hidroavión hid) {
	this.hid = hid;
}
public Superman getSup() {
	return sup;
}
public void setSup(Superman sup) {
	this.sup = sup;
}
public Aguila getAgu() {
	return agu;
}
public void setAgu(Aguila agu) {
	this.agu = agu;
}
public CardenalNorteño getCan() {
	return can;
}
public void setCan(CardenalNorteño can) {
	this.can = can;
}
public Pterodactilo getPte() {
	return pte;
}
public void setPte(Pterodactilo pte) {
	this.pte = pte;
}
public Ave getAv() {
	return av;
}
public void setAv(Ave av) {
	this.av = av;
}

}