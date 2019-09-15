package modelo;

public class Drone implements Flyer {

	public String despegar() {
		String a = "Despego cuando utilizan mi control";
		return a;
	}
	public String volar() {
		String a = "no vuelo mas de un limite establecido";
		return a;
	}
	public String aterrizar() {
		String a = "Aterrizo automaticamente oprimiendo un boton de mi control";
		return a;
	}
	public String grabarVideo() {
		String a = "Grabo 4K a 60fps";
		return a;
	}

}
