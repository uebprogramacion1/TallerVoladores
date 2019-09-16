package Modelo;

public class Supercan extends SuperHeroe {
 private int saltos;
	public Supercan( ) {
		saltos = 0;
	
}

	
	@Override
	public String saltarEdificio(String salta) {
		// TODO Auto-generated method stub
		return "Salto a los edificos con mi 4 patas";
	}
	@Override
	public String saltarEdificio(int NUmsalta) {
		saltos = NUmsalta;
		
		return "Puedo saltar "+" " + saltos+" "+ "veces al dia";
	}
	@Override
	public String misPoderes() {
		
		return "Puedo ladrar como para destruir un edificio ";
	}


	public int getSaltos() {
		return saltos;
	}


	public void setSaltos(int saltos) {
		this.saltos = saltos;
	}
	
	
}
