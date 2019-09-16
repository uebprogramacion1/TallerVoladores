package Modelo;

public class Superman extends SuperHeroe  implements FLYER {

	private int saltos;
	public Superman() {
		saltos = 0;
		
	}
	@Override
	public String takeOff() {
		String takeOff = "Superman Esta Despegando";
		return takeOff;
	}

	@Override
	public String Land() {
		String l = "Superman Esta Aterrizando";
		return l;
	}

	@Override
	public String Fly() {
		String F = "Superman Esta volando";
		return F;
	}

	public String leapBuilding() {
		String h = "Superman Esta saltando a un edificio ";
		return h;
	}
	public String StopBullet() {
		String Stop = "Superman Deteniendo Balas ";
		return Stop;
	}
	


	@Override
	public String saltarEdificio(String salta) {
		
		return null;
	}

	@Override
	public String saltarEdificio(int NUmsalta) {
		this.saltos = NUmsalta;
		return "Salto a los edificios" +" "+ saltos + " "+ "veces Con mis fuertes piernas" ;
	}

	@Override
	public String misPoderes() {
		
		return "Puedo volar y tengo Super Fuerza";
	}
	public int getSaltos() {
		return saltos;
	}
	public void setSaltos(int saltos) {
		this.saltos = saltos;
	}
	
}
