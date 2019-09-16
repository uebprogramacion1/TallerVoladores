package modelo;

public class Aguila extends Animal implements Volador {

	public String Comer() {
		return "Atrapar comida. ";
	}

	public String Despegar() {
		return "Toma impulso para volar. ";
	}

	public String Aterrizar() {
		return "Deja de mover sus alas. ";
	}
	
	public String Volar() {
		return "Mueve sus alas para mantener el vuelo. ";
	}
	
	public String Dormir() {
		return "Se posa sobre una roca para dormir. ";
	}
}