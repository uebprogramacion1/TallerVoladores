package modelo;

public class Pajaro implements Animal , Volador {

	@Override
	public String empezarVuelo() {
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

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "comiendo";
	}
	public void ponerHuevos() {
		
	}
	public void hacerNido() {
		
	}
}
