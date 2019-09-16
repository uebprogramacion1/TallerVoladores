package Modelo;

public class Mundo {

	private Avion avion;
	private Helicoptero helicop;
	private HidroPlano hidro;
	private Pajaro pajaro;
	private Spiderman spider;
	private Supercan can;
	private SuperHeroe heroe;
	private Superman man;
	private Persistencia per;

	
	public Mundo() {
	
		avion = new Avion();
		helicop = new Helicoptero();
		hidro = new HidroPlano();
		pajaro = new Pajaro();
		spider = new Spiderman();
		can = new Supercan();
		per = new Persistencia();
		man = new Superman();
		
	}


	public Avion getAvion() {
		return avion;
	}


	public void setAvion(Avion avion) {
		this.avion = avion;
	}


	public Helicoptero getHelicop() {
		return helicop;
	}


	public void setHelicop(Helicoptero helicop) {
		this.helicop = helicop;
	}


	public HidroPlano getHidro() {
		return hidro;
	}


	public void setHidro(HidroPlano hidro) {
		this.hidro = hidro;
	}


	public Pajaro getPajaro() {
		return pajaro;
	}


	public void setPajaro(Pajaro pajaro) {
		this.pajaro = pajaro;
	}


	public Spiderman getSpider() {
		return spider;
	}


	public void setSpider(Spiderman spider) {
		this.spider = spider;
	}


	public Supercan getCan() {
		return can;
	}


	public void setCan(Supercan can) {
		this.can = can;
	}


	public SuperHeroe getHeroe() {
		return heroe;
	}


	public void setHeroe(SuperHeroe heroe) {
		this.heroe = heroe;
	}


	public Superman getMan() {
		return man;
	}


	public void setMan(Superman man) {
		this.man = man;
	}


	public Persistencia getPer() {
		return per;
	}


	public void setPer(Persistencia per) {
		this.per = per;
	}
	

	
}
