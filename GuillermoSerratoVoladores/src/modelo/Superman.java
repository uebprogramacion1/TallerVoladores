package modelo;

public class Superman extends Kriptoniano implements Volador {

	
	@Override
	public String despegar() {
		return "Superman esta despegando";
	}

	@Override
	public String aterrizar() {
		return "Superman esta aterrizando";
	}

	@Override
	public String volar() {
		return "Superman esta volando";
	}
	
	@Override
	public String comer() {
		return super.comer();
	}
	
	public String detenerBala() {
		return "Superman detuvo una bala";
	}
	
	public String saltarEdificio() {
		return "Superman salto un edificio";
	}

}
