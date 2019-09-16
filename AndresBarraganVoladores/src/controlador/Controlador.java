package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	Mundo m;
	Interfaz gui;

	public Controlador() {
		m = new Mundo();

		gui = new Interfaz();
		gui.mostrarDato(m.getAnimal().eat());
		m.getSuperman().eat();
		gui.mostrarDato(m.getBird().fly());

	}

}
