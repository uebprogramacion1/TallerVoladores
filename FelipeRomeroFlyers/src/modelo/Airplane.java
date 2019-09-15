package modelo;

public class Airplane extends Vehicle implements Flyer{
	
	public String takeOff() {
		return "El avion se va";
		}
	public String land() {
		return "El avion llega";
		}
	public String fly() {
		return "Alla va el avion";
		}

}

