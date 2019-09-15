package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	public Mundo m;
	public Interfaz gui;

	public Controlador () {
		m = new Mundo();
		gui = new Interfaz();

		gui.mostrarVehicle(m.getVeh().clasificar());
		gui.mostrarAirplane(m.getAir().takeoff()
				+m.getAir().land()+m.getAir().fly());
		gui.mostrarSeaplane(m.getSea().describir());
		gui.mostrarHelicoptero(m.getHel().Volar());
		gui.mostrarBird(m.getBird().takeoff()
				+m.getBird().land()
				+m.getBird().fly()
				+m.getBird().buildNest()
				+m.getBird().layEggs()
				+m.getBird().eat());
		gui.mostrarDumbo(m.getDumbo().takeoff()
				+m.getDumbo().land()
				+m.getDumbo().fly()
				+m.getDumbo().eat()
				+m.getDumbo().amar());
		gui.mostrarKryptonian(m.getKry().crear());
		gui.mostrarSuperman(m.getSman().takeoff()
				+m.getSman().land()
				+m.getSman().fly()
				+m.getSman().leapBuilding()
				+m.getSman().stopBullet()
				+m.getSman().eat());
		gui.mostrarSupergirl(m.getSgirl().takeoff()
				+m.getSgirl().land()
				+m.getSgirl().fly()
				+m.getSgirl().proteger()
				+m.getSgirl().eat());
		gui.mostrarCometa(m.getCom().takeoff()
				+m.getCom().land()
				+m.getCom().fly());
		
	}

}
