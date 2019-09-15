package modelo;

public class Helicoptero extends Avión {

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Gira sus hélices para despegar. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Baja la velocidad de hélices y se mantiene estable hasta aterrizar. ";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Se inclina para avanzar. ";
	}

}