package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	private Mundo m;
	private Interfaz gui;
	public Controlador() {
		m = new Mundo();
		gui = new Interfaz();
		

		gui.MostrarAirplane(m.getAir().fly());
		gui.MostrarHelicopter(m.getHel().land());
		gui.MostrarAirplane(m.getAir().takeOff());
		gui.MostrarBird(m.getBir().eat());
		gui.MostrarBird(m.getBir().takeOff());
		gui.MostrarSuperman(m.getSupe().eat());
	    gui.MostrarSuperman(m.getSupe().land());
	    gui.MostrarSuperman(m.getSupe().LeapBuilding());
	    gui.MostrarBatman(m.getBat().stopBullet()  
	    		+m.getBat().Luchar());
	    gui.MostrarGlobo(m.getGloA().fly()
	    		+m.getGloA().Funcion());
	    gui.MostrarBird(m.getAgui().buildNest()
	    		+m.getAgui().Velocidad());
	    
	}
	
}
