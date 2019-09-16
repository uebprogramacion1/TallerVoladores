package Modelo;

public class Helicoptero extends Avion  {

	
	public Helicoptero() {
		
	}
	@Override
	public String ponerGasolina() {
		String p = "El tanque de gasolina ha sido llenado";
		return p;
	}

	@Override
	public int medirGasolina(int gaso) {
		
		return gaso;
	}
	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "El Helicoptero esta despegando";
	}
	@Override
	public String Land() {
		// TODO Auto-generated method stub
		return "El Helicoptero esta Aterrizando";
	}
	@Override
	public String Fly() {
		// TODO Auto-generated method stub
		return "EL Helicoptero esta volando";
	}
	@Override
	public String reparacion() {
		String j = "El Helicoptero necesita ser reparado";
		return j;
	}

}
