package modelo;

public class Avión extends Vehiculo implements  Volador {

	public String transportar() {
		return "llevo gente";
	}
	public String despegar() {
		return "¿ A que hora salimos?";
	}

	public String aterrizar() {
		return "¿Puedo aterrizar acá?";
	}
	public String volar() {
		return "¿tenemos suficiente gasolina para seguir volando?";
	}

}
