package modelo;

public class Ave extends Animal implements Volador {

	
	@Override
	public String despegar() {
		return "El ave esta despegando";
	}

	@Override
	public String aterrizar() {
		return "El ave esta aterrizando";
	}

	@Override
	public String volar() {
		return "El ave esta volando";
	}
	
	public String construirNido() {
		return "El ave construyo un nido";
	}
	
	public String ponerHuevos() {
		return "El ave pone huevos";
	}
	
	@Override
	public String comer() {
		return super.comer();
	}

}
