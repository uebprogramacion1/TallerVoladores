package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	Mundo m;
	Interfaz gui;

	public Controlador() {
		m = new Mundo();

		gui = new Interfaz();

		// animal
		gui.mostrarDato(m.getAnimal().eat("los animales comen"));

		// superman
		gui.mostrarDato(m.getSuperman().takeOff());
		gui.mostrarDato(m.getSuperman().land());
		gui.mostrarDato(m.getSuperman().fly());
		gui.mostrarDato(m.getSuperman().leapBuilding());
		gui.mostrarDato(m.getSuperman().stopBullet());
		gui.mostrarDato(m.getSuperman().eat("Superman come lo que quiera"));

		// bird
		gui.mostrarDato(m.getBird().takeOff());
		gui.mostrarDato(m.getBird().land());
		gui.mostrarDato(m.getBird().fly());
		gui.mostrarDato(m.getBird().buildNest());
		gui.mostrarDato(m.getBird().layEggs());
		gui.mostrarDato(m.getBird().eat("Me gusta comer semillas"));

		// airplane
		gui.mostrarDato(m.getAirplane().takeOff());
		gui.mostrarDato(m.getAirplane().land());
		gui.mostrarDato(m.getAirplane().fly());

		// superwoman
		gui.mostrarDato(m.getSuperwoman().eat("I eat healthy"));
		gui.mostrarDato(m.getSuperwoman().takeOff());
		gui.mostrarDato(m.getSuperwoman().land());
		gui.mostrarDato(m.getSuperwoman().fly());

	}

}
