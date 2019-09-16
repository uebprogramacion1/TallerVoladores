package modelo;

public class Helicoptero extends Avión {
	public String Despegar() {
		return "Enciende su motor. ";
	}
	
	public String Aterrizar() {
		return "Detiene sus helices lentamente. ";
	}
	
	public String Volar() {
		return "Mantiene su altura y velocidad constantes para volar. ";
	}

}