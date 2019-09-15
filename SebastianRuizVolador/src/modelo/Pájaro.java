package modelo;

public class Pájaro extends Animal implements Volador{
	
	public String comer() {
		return "Me comi como 80 semillas";
	}
	public String ponerHuevos() {
		return "Puse 4 huevos";
	}
	public String construirNidos() {
		return"Construi un nuevo nido para mis polluelos";
	}
	public String despegar() {
		return "ya despegue hacia el sur";
	}
	public String aterrizar() {
		return "aterrice en Brasil";
	}
	public String volar() {
		return "volé todo el Amazonas";
	}

}
