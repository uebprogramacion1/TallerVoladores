package modelo;

public class Airplane extends Vehiculo implements Flyer   {

	
	public String despegar() {
		String a = "Me estoy elevando del suelo";
		return a;
	}

	
	public String volar() {
        String a = "Me mantegon por encima del suelo";
		return a;
	}

	public String aterrizar() {

		String a = "Deciendo lentamente";
		return a;
	}
}
