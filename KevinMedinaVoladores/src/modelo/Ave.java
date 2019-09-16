package modelo;

public class Ave extends Animal implements Volador {
	public String Despegar() {
		return "Enprende el vuelo con sus alas. ";
	}

	public String Aterrizar() {
		return "Desacelera el movimiento de sus alas. ";
	}

	public String Volar() {
		return "Extiende sus alas para planear y las bate para ganar altura de ser necesario. ";
	}
	
    public String CrearNido() {
    	return "Busca materiales para crear nido. ";
    }
    
    public String DejarHuevo() {
    	return "Deja su huevo en el nido. ";
    }

	public String Comer() {
		return "Agarra semillas del suelo. ";
	}
   
}