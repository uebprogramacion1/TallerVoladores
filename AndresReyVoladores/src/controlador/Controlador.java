package controlador;
import modelo.Mundo;
import vista.Interfaz;
public class Controlador {
	private Mundo m;
	private Interfaz gui;
	public Controlador() {
		m= new Mundo();
		gui=new Interfaz();
		gui.mostrarSuperman(m.getSup().Despegar());
		gui.mostrarSuperman(m.getSup().Volar());
		gui.mostrarSuperman(m.getSup().Aterrizar());
		gui.mostrarSuperman(m.getSup().DetenerBala());
		gui.mostrarSuperman(m.getSup().Comer());
		gui.mostrarSuperman(m.getSup().AterrizarEnEdificio());
		gui.mostrarAve(m.getAve().Despegar());
		gui.mostrarAve(m.getAve().Volar());
		gui.mostrarAve(m.getAve().Aterrizar());
	    gui.mostrarAve(m.getAve().CrearNido());
	    gui.mostrarAve(m.getAve().DejarHuevo());
	    gui.mostrarAve(m.getAve().Comer());
	    gui.mostrarHelicoptero(m.getHel().Despegar());
	    gui.mostrarHelicoptero(m.getHel().Volar());
	    gui.mostrarHelicoptero(m.getHel().Aterrizar());
	    gui.mostrarHidAvión(m.getHid().Despegar());
	    gui.mostrarHidAvión(m.getHid().Volar());
	    gui.mostrarHidAvión(m.getHid().Aterrizar());
	    gui.mostrarJet(m.getJet().Despegar());
	    gui.mostrarJet(m.getJet().Volar());
	    gui.mostrarJet(m.getJet().Aterrizar());
	    gui.mostrarJet(m.getJet().ViajeRapido());
	    gui.mostrarMurciélagos(m.getMur().Despegar());
	    gui.mostrarMurciélagos(m.getMur().Volar());
	    gui.mostrarMurciélagos(m.getMur().Aterrizar());
	    gui.mostrarMurciélagos(m.getMur().Comer());
	    gui.mostrarMurciélagos(m.getMur().Dormir());
	    gui.mostrarMariposa(m.getMar().Despegar());
	    gui.mostrarMariposa(m.getMar().Volar());
	    gui.mostrarMariposa(m.getMar().Aterrizar());
	    gui.mostrarMariposa(m.getMar().Comer());
	    gui.mostrarMariposa(m.getMar().SalirDeCapullo());
	}
}