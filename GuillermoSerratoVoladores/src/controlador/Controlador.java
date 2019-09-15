package controlador;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo m;
	private Interfaz gui;

	public Controlador() {

		m = new Mundo();
		gui = new Interfaz();

		gui.mostrarDatos(m.getSup().detenerBala());
		gui.mostrarDatos(m.getJor().crearInventos());
		gui.mostrarDatos(m.getAv().construirNido());
		gui.mostrarDatos(m.getMur().beberSangre());
		gui.mostrarDatos(m.getHeli().despegar());
		gui.mostrarDatos(m.getHid().aterrizar());
		gui.mostrarDatos(m.getAut().desplazarse());
		
	}

}
