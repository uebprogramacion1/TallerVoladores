package controlador;
import modelo.*; 
import vista.*;
public class Controlador {
	
	private Mundo m;
	private Interfaz gui;
	
	public Controlador() {
		
		m = new Mundo();
		gui = new Interfaz();

	    //airplane
		gui.mostrar(m.getAir().aterrizar());
		gui.mostrar(m.getAir().despegar());
		gui.mostrar(m.getAir().volar());
		//bird
		gui.mostrar(m.getBi().aterrizar());
		gui.mostrar(m.getBi().comer());
		gui.mostrar(m.getBi().despegar());
		gui.mostrar(m.getBi().ponerHuevos());
		gui.mostrar(m.getBi().volar());
		gui.mostrar(m.getBi().construirNido());
		//superman
		gui.mostrar(m.getSu().aterrizar());
		gui.mostrar(m.getSu().comer());
		gui.mostrar(m.getSu().despegar());
		gui.mostrar(m.getSu().detenerBala());
		gui.mostrar(m.getSu().saltarEdificio());
		gui.mostrar(m.getSu().volar());
		//seaplane
		gui.mostrar(m.getSea().aterrizar());
		gui.mostrar(m.getSea().despegar());
		gui.mostrar(m.getSea().volar());
		//helicopter
		gui.mostrar(m.getHe().aterrizar());
		gui.mostrar(m.getHe().despegar());
		gui.mostrar(m.getHe().volar());
		//supergirl
		gui.mostrar(m.getSgirl().aterrizar());
		gui.mostrar(m.getSgirl().comer());
		gui.mostrar(m.getSgirl().despegar());
		gui.mostrar(m.getSgirl().pelear());
		gui.mostrar(m.getSgirl().volar());
		//drone
		gui.mostrar(m.getDro().aterrizar());
		gui.mostrar(m.getDro().despegar());
		gui.mostrar(m.getDro().grabarVideo());
		gui.mostrar(m.getDro().volar());
		//dirigible
		gui.mostrar(m.getDi().aterrizar());
		gui.mostrar(m.getDi().despegar());
		gui.mostrar(m.getDi().rentarPublicidad());
		gui.mostrar(m.getDi().volar());
	}
}
