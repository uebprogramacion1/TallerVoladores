package controlador;
import modelo.Mundo;
import vista.Interface;

public class Controlador {
	private Mundo m;
	private Interface gui;
	public Controlador() {
		m= new Mundo();
		gui=new Interface();
		
		gui.mostrarSuperman(m.getSup().Despegar());
		gui.mostrarSuperman(m.getSup().Volar());
		gui.mostrarSuperman(m.getSup().Aterrizar());
		gui.mostrarSuperman(m.getSup().DetenerBala());
		gui.mostrarSuperman(m.getSup().Comer());
		gui.mostrarSuperman(m.getSup().AterrizarEnEdificio());
		gui.mostrarAve(m.getAv().Despegar());
		gui.mostrarAve(m.getAv().Volar());
		gui.mostrarAve(m.getAv().Aterrizar());
	    gui.mostrarAve(m.getAv().CrearNido());
	    gui.mostrarAve(m.getAv().DejarHuevo());
	    gui.mostrarAve(m.getAv().Comer());
	    gui.mostrarHelicoptero(m.getHel().Despegar());
	    gui.mostrarHelicoptero(m.getHel().Volar());
	    gui.mostrarHelicoptero(m.getHel().Aterrizar());
	    gui.mostrarHidAvión(m.getHid().Despegar());
	    gui.mostrarHidAvión(m.getHid().Volar());
	    gui.mostrarHidAvión(m.getHid().Aterrizar());
	    gui.mostrarPterodactilo(m.getPte().Despegar());
	    gui.mostrarPterodactilo(m.getPte().Volar());
	    gui.mostrarPterodactilo(m.getPte().Aterrizar());
	    gui.mostrarAguila(m.getAgu().Despegar());
	    gui.mostrarAguila(m.getAgu().Volar());
	    gui.mostrarAguila(m.getAgu().Aterrizar());
	    gui.mostrarAguila(m.getAgu().Comer());
	    gui.mostrarAguila(m.getAgu().Dormir());
	    gui.mostrarCardenalNorteño(m.getCan().Despegar());
	    gui.mostrarCardenalNorteño(m.getCan().Volar());
	    gui.mostrarCardenalNorteño(m.getCan().Aterrizar());
	    gui.mostrarCardenalNorteño(m.getCan().Comer());
	}
}
