package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo m;
	private Interfaz gui;
	
	
	
	public Controlador() {
		
		m= new Mundo();
		gui=new Interfaz();
		
		gui.mostrarDato(m.getSea().takeOff());
		gui.mostrarDato(m.getHel().land());
		gui.mostrarDato(m.getPal().color());
		gui.mostrarDato(m.getHjs().eat());
		
	}
	

}
