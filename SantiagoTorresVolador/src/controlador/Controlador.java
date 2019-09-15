package controlador;

import modelo.Mundo;
import vista.Vista;

public class Controlador {
	private Mundo m;
	private Vista v;
	public Controlador() {
		m = new Mundo();
		v = new Vista();
		v.name(m.getHel().takeOff());
	}

}
