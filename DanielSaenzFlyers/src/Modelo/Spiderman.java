package Modelo;

public class Spiderman extends SuperHeroe{
	public Spiderman() {
		
		
	}

	@Override
	public String saltarEdificio(String salta) {
		salta = "Salto con mis telara�as";
		return salta;
	}

	@Override
	public String saltarEdificio(int NUmsalta) {
		int t = NUmsalta;
		return "Salto por los edificios con mis poderes " + " "+ t+ " " +" veces ";
	}

	@Override
	public String misPoderes() {
		
		return "Puedo lanzar telara�as de mis manos";
	}
}
	
