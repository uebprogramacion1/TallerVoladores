package modelo;

public class Murcielago extends Animal implements Volador{

	
	@Override
	public String despegar() {
		return "El murcielago ";
	}

	@Override
	public String aterrizar() {
		return "El murcielago aterriza";
	}

	@Override
	public String volar() {
		return "El murcielago vuela";
	}

	public String beberSangre() {
		return "El muercielago bebe sangre";
	}
	
	@Override
	public String comer() {
		return super.comer();
	}
}
