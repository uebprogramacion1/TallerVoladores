package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo mundo;
	private Interfaz interfaz;
	
	public Controlador() {
		
		mundo = new Mundo();
		interfaz = new Interfaz();
		
		interfaz.darMesanje(mundo.getSuperman().leapBuilding());
		interfaz.darMesanje(mundo.getSuperman().stopBullet());
		interfaz.darMesanje(mundo.getBird().buildNest());
		interfaz.darMesanje(mundo.getBird().layEggs());
		interfaz.darMesanje(mundo.getSeaPlane().fly());
		interfaz.darMesanje(mundo.getSeaPlane().takeOff());



		
	}

}