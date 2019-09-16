package modelo;

public class CardenalNorteño extends Animal implements Volador {
	public String Despegar() {
		return "Mueve sus alas rapidamente. ";
	}
	
	public String Aterrizar() {
		return "Busca un arbol para aterrizar.";
	}

	public String Volar() {
		return "Usa sus alas para planear.";
	}
	
	public String Comer() {
		return "Se acerca a los arbustos con bayas.";
	}

}