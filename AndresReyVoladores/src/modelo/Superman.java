package modelo;

public class Superman extends Kryptonianos implements Volador {

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Destruye suelo al despegar. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Aterriza en el suelo y deja un crater.";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Vuela más rapido que una bala. ";
	}
	public String AterrizarEnEdificio() {
		return "Aterriza suavemente en edificio para no hacer daños. ";
	}
	public String DetenerBala() {
		return "Para la bala con su mano.";
	}

	@Override
	public String Comer() {
		return "Come manzanas. ";
	}

}
