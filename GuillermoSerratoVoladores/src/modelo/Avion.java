package modelo;

public class Avion extends Vehiculo implements Volador {

	
	@Override
	public String despegar() {
		return "Esta despegando";
	}

	@Override
	public String aterrizar() {
		return "Esta aterrizando";
	}

	@Override
	public String volar() {
		return "Esta Volando";
	}

}
