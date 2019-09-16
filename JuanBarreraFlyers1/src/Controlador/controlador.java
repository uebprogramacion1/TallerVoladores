package Controlador;

import Mundo.Mundo;
import Vista.Interfaz;

public class controlador {
	
	private Mundo md;
	private Interfaz iz;
	
	public controlador(){
		 
		md = new Mundo();
		iz = new Interfaz();
		
		iz.mensajeVuelo(md.getAi());
	}
	

}
