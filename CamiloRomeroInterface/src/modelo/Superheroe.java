package modelo;

public class Superheroe {

	public String land() {
		return "el heroe aterrizo";
	}

	public String takeOff() {
		return "el heroe despego";
	}

	public String fly() {
		return "el heroe esta volando";
	}

	public String eat() {
		return "el heroe come";
	}
	
	public String leapBuilding(String hero) {
		
		return hero + " salto el edificio ";
	}
	
	public String leapBuilding (String hero, String superPower) {
		return hero + " salto el edificio " + superPower;
	}
	
	public String leapBuilding (String hero, String superPower, int numero) {
		return hero + " salto con su " + superPower +" "+ numero + " edificios  "; 
	}

}


