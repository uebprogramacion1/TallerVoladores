package Modelo;

public class Spiderman extends SuperHeroe{
	public Spiderman() {
		
		
	}

	@Override
	public String saltarEdificio(String salta) {
		salta = "Salto con mis telarañas";
		return salta;
	}

	@Override
	public String saltarEdificio(int NUmsalta) {
		int t = NUmsalta;
		return "Salto por los edificios con mis poderes " + " "+ t+ " " +" veces ";
	}

	@Override
	public String misPoderes() {
		
		return "Puedo lanzar telarañas de mis manos";
	}
}
	
