package modelo;

public class Jet extends Avión{
	public String Despegar() {
		return "Enciende sus turbinas y comienza a avanzar hasta despegar.";
	}
	public String Aterrizar() {
		return "Controla angulo de aterrizaje, despliega llantas y al tocar tierra reduce velocidad.";
	}
	public String Volar() {
		return "Mueve sus alas para girar, ganar altura o baja. ";
	}
	public String ViajeRapido() {
		return"Aumenta la velocidad para llegar más rapido a su destino. ";
	}
}
