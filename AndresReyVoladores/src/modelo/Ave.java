package modelo;

public class Ave extends Animal implements Volador {

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Bate sus alas para despegar. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Planea un poco y al estar cerca del suelo bate sus alas para reducir su velocidad y aterrizar suavemente. ";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Extiende sus alas para planear y las bate para ganar altura de ser necesario. ";
	}
    public String CrearNido() {
    	return "Crea un nido con paja. ";
    }
    public String DejarHuevo() {
    	return "Deja un huevo en su nido. ";
    }

	@Override
	public String Comer() {
		// TODO Auto-generated method stub
		return "Come semillas. ";
	}
   
}
