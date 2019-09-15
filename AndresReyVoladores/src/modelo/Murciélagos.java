package modelo;

public class Murciélagos extends Animal implements Volador {

	@Override
	public String Comer() {
		// TODO Auto-generated method stub
		return "Come frutas. ";
	}

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Se suelta del techo para iniciar vuelo. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Se cuelga en el techo para aterrizar. ";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Bate sus alas para volar de noche. ";
	}
	public String Dormir() {
		return"Se cuelga de cabeza para dormir. ";
	}

}