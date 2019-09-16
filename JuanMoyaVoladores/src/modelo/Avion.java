package modelo;

public class Avion implements Volador {
	 Vehiculo c = new Vehiculo();
	
	@Override
	public String empezarVuelo() {
		// TODO Auto-generated method stub
		return "iniciando vuelo";
	}

	@Override
	public String volar() {
		// TODO Auto-generated method stub
		return "Volando";
	}

	@Override
	public String aterrisar() {
		// TODO Auto-generated method stub
		return "aterrisando";
	}


}
