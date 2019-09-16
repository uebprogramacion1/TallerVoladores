package Modelo;

public class Avion extends Vehiculo implements FLYER, Gasolina  {

	public Avion() {
		
	}
	@Override
	public String takeOff() {
		String takeOff = "El Avion Esta Despegando";
		return takeOff;
	}

	@Override
	public String Land() {
		String land = "El Avion  Esta Aterrizando";
		return land;
	}

	@Override
	public String Fly() {
		String fly = "El Avion  Esta volando ";
		return fly;
	}
	@Override
	public String ponerGasolina() {
		String f = "El tanque esta ha sido llenado";
		return f;
	}
	@Override
	public int medirGasolina(int gaso) {
		
		return gaso;
	}
	@Override
	public String reparacion() {
		String j = "El avion necesita ser reparado";
		return j;
	}
	@Override
	public String reparacion(int veces) {
		// TODO Auto-generated method stub
		return "ya ha sido reparado " + veces + " " +"veces";
	}
	
	
	

	

}
