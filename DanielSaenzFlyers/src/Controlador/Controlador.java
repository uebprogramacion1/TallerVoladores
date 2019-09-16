package Controlador;
import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	
	private Mundo bd;
	private Interfaz gui;
	public Controlador() {
		gui = new Interfaz();
		bd = new Mundo();
		switch (gui.mostrarMenu(bd.getPer().Menu1)) {
		case 1:
			switch (gui.mostrarMenu(bd.getPer().Menu2)) {
			case 1:
				gui.escribirDato("",bd.getAvion().takeOff());
				gui.escribirDato("", bd.getAvion().Fly());
				gui.escribirDato("",bd.getAvion().Land());
				bd.getAvion().medirGasolina(Integer.parseInt(gui.pedirDato("Que tanta gasolina desea colocar")));
				gui.escribirDato("", bd.getAvion().ponerGasolina());
				
				
				break;

			case 2:
				gui.escribirDato("",bd.getHelicop().takeOff());
				gui.escribirDato("", bd.getHelicop().Fly());
				gui.escribirDato("",bd.getHelicop().Land());
				bd.getAvion().medirGasolina(Integer.parseInt(gui.pedirDato("Que tanta gasolina desea colocar")));
				gui.escribirDato("", bd.getHelicop().ponerGasolina());
				break;
			case 3:
				gui.escribirDato("",bd.getHidro().takeOff());
				gui.escribirDato("", bd.getHidro().Fly());
				gui.escribirDato("",bd.getHidro().Land());
				bd.getAvion().medirGasolina(Integer.parseInt(gui.pedirDato("Que tanta gasolina desea colocar")));
				gui.escribirDato("", bd.getHidro().ponerGasolina());
				break;
				
			}
			
			break;

		case 2:
			switch (gui.mostrarMenu(bd.getPer().Menu3)) {
			case 1:
				gui.escribirDato("",bd.getPajaro().takeOff());
				gui.escribirDato("", bd.getPajaro().Fly());
				gui.escribirDato("",bd.getPajaro().Land());
				gui.escribirDato("", bd.getPajaro().layEggs());
				gui.escribirDato("", bd.getPajaro().construirNidos());
				gui.escribirDato("", bd.getPajaro().Eat());
				
				break;

			case 2:
				switch (gui.mostrarMenu(bd.getPer().Menu4)) {
				case 1:
					gui.escribirDato("", bd.getMan().takeOff());
					gui.escribirDato("", bd.getMan().Fly());
					gui.escribirDato("",bd.getMan().Land());
					gui.escribirDato("", bd.getMan().leapBuilding());
					gui.escribirDato("", bd.getMan().StopBullet());
					gui.escribirDato("", bd.getMan().saltarEdificio(Integer.parseInt(gui.pedirDato("Ingrese el numero de saltos"))));
					gui.escribirDato("", bd.getMan().misPoderes());
					
					break;

				case 2:
					gui.escribirDato("", bd.getCan().saltarEdificio("Salto a los edificos con mi 4 patas"));
					gui.escribirDato("", bd.getCan().saltarEdificio(Integer.parseInt(gui.pedirDato("Ingrese el numero de saltos"))));
					gui.escribirDato("", bd.getCan().misPoderes());
					
					break;
				case 3:
					gui.escribirDato("", bd.getSpider().saltarEdificio(" Salto con mis telarañas"));
					gui.escribirDato("", bd.getSpider().saltarEdificio(Integer.parseInt(gui.pedirDato("Ingrese el numero de saltos"))));
					gui.escribirDato("", bd.getSpider().misPoderes());
					
					break;
				};
			};
		}
	}
	

}