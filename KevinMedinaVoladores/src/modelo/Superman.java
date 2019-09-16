package modelo;

public class Superman extends Kryptoniano implements Volador {
	public String Despegar() {
		return "Fija su destino. ";
	}

	public String Aterrizar() {
		return "Destruye el suelo al aterrizar.";
	}

	public String Volar() {
		return "Rapido y veloz. ";
	}
	
	public String AterrizarEnEdificio() {
		return "Desciende sobre un edificio. ";
	}
	
	public String DetenerBala() {
		return "Las balas no pueden atravezar la dureza de su cuerpo.";
	}

	public String Comer() {
		return "Se alimenta como cualquier humano. ";
	}

}