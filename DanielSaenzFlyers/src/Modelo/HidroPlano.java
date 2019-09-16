package Modelo;

public class HidroPlano extends Avion  {

	@Override
	public String ponerGasolina() {
		String h = "El tanque  de gasolina ha sido llenado";
		return h;
	}

	@Override
	public int medirGasolina(int gaso) {
		// TODO Auto-generated method stub
		return gaso;
	}

	@Override
	public String takeOff() {
		
		return "El Hidroplano esta Despegando";
	}

	@Override
	public String Land() {
		// TODO Auto-generated method stub
		return "El Hidroplano esta Aterrizando";
	}

	@Override
	public String Fly() {
		// TODO Auto-generated method stub
		return " El Hidroplano esta Volando";
	}
	@Override
	public String reparacion() {
		String j = "El Hidroplano necesita ser reparado";
		return j;
	}

}
