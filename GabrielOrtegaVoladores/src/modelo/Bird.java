package modelo;

public class Bird extends Animal implements Flyer {

	public String comer() {
		String a = "Como cosas del piso";
		return a;
	}
	public String despegar() {

		String a = "comienzo a volar cuando me siguen";
		return a;
	}
	public String volar() {
		String a = "Vuelo con mis alas";

		return a;
	}
	public String aterrizar() {

		String a = "Aterrizo con mis patas";
		return a;
	}
	public String construirNido(){
		String a = "Construyo con paja";
		return a;
	}
	public String ponerHuevos() {
		String a = "pongo huevos";
		return a;
	}
}
