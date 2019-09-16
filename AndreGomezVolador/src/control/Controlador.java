package control;

import modelo.mundo;
import vista.Interfaz;

public class Controlador {
	
	private mundo m;
	private Interfaz gui;
	
	public Controlador() {
		m= new mundo();
		
		gui=new Interfaz();
		
		gui.cadena(m.getSu().stopBullet());
	}

}
