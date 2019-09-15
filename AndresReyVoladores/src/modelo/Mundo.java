package modelo;

public class Mundo {
private Helicoptero hel;
private Hidroavión hid;
private Superman sup;
private Ave ave;
private Jet jet;
private Murciélagos mur;
private Mariposa mar;
public Mundo() {
	hel = new Helicoptero();
	hid = new Hidroavión();
	sup = new Superman();
	ave = new Ave();
	jet = new Jet();
	mur = new Murciélagos();
	mar = new Mariposa();
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
public Ave getAve() {
	return ave;
}
public void setAve(Ave ave) {
	this.ave = ave;
}
public Jet getJet() {
	return jet;
}
public void setJet(Jet jet) {
	this.jet = jet;
}
public Murciélagos getMur() {
	return mur;
}
public void setMur(Murciélagos mur) {
	this.mur = mur;
}
public Mariposa getMar() {
	return mar;
}
public void setMar(Mariposa mar) {
	this.mar = mar;
}
}