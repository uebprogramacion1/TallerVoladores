package controlador;

import modelo.Mundo;
import vista.InterfazGrafica;

public class Controlador {
	
	private Mundo m ;
	private InterfazGrafica gui;
	
	public Controlador() {
		m = new Mundo();
		gui = new InterfazGrafica();
		
		
		gui.mostrarDatos(m.getSupern().fly());
	}

}
