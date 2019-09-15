package controlador;
import modelo.*;
import vista.*;
	public class Controlador {

	private Mundo m;
	private Interfaz gui;
	
	public  Controlador() {
		
		m = new Mundo();
		gui = new Interfaz();
		//superman
		gui.mostrarDato(m.getSup().detenerBalas());
		gui.mostrarDato(m.getSup().aterrizar());
		gui.mostrarDato(m.getSup().despegar());
		gui.mostrarDato(m.getSup().volar());
		gui.mostrarDato(m.getSup().saltarEdificios());
		gui.mostrarDato(m.getSup().comer());
		//Supergirl
		gui.mostrarDato(m.getSupg().detenerBalas());
		gui.mostrarDato(m.getSupg().aterrizar());
		gui.mostrarDato(m.getSupg().despegar());
		gui.mostrarDato(m.getSupg().volar());
		gui.mostrarDato(m.getSupg().saltarEdificios());
		gui.mostrarDato(m.getSupg().comer());
		gui.mostrarDato(m.getSupg().gritarFortisimo());
		//Bicicleta 
		gui.mostrarDato(m.getBic().saltar());
		gui.mostrarDato(m.getBic().girar());
		gui.mostrarDato(m.getBic().frenar());
		gui.mostrarDato(m.getBic().transportar());
		//Avión
		gui.mostrarDato(m.getAvi().despegar());
		gui.mostrarDato(m.getAvi().aterrizar());
		gui.mostrarDato(m.getAvi().transportar());
		gui.mostrarDato(m.getAvi().volar());
		//Pájaro
		gui.mostrarDato(m.getPaj().despegar());
		gui.mostrarDato(m.getPaj().aterrizar());
		gui.mostrarDato(m.getPaj().comer());
		gui.mostrarDato(m.getPaj().volar());
		gui.mostrarDato(m.getPaj().construirNidos());
		gui.mostrarDato(m.getPaj().ponerHuevos());
		//nave espacial
		gui.mostrarDato(m.getNav().despegar());
		gui.mostrarDato(m.getNav().aterrizar());
		gui.mostrarDato(m.getNav().volar());
		gui.mostrarDato(m.getNav().viajarinterplanetariamente());


	}
	}