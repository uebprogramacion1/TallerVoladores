package modelo;

public class Hidroavión extends Avión {
	public String Despegar() {
		return "Despega desde el agua. ";
	}

	public String Aterrizar() {
		return "Aterriza en el agua. ";
	}

	public String Volar() {
		return "Mantiene su altura. ";
	}

}