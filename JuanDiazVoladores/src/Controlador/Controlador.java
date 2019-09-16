package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	
	private Mundo mundo;
	private Interfaz interfaz;
	
	public Controlador() {
		mundo = new Mundo();
		interfaz = new Interfaz();
		
		interfaz.mostrarAirPlane(mundo.takeOff(), mundo.Fly(), mundo.Land(), mundo.Machine(), mundo.echarGasolina(), mundo.medirGasolina());
		interfaz.mostrarBird(mundo.getBird().takeOff(), mundo.getBird().Fly(), mundo.getBird().Land(), mundo.getBird().buildNest(), mundo.getBird().layEggs(), mundo.getBird().Eat());
		interfaz.mostrarSuperMan(mundo.getSuperman().takeOff(), mundo.getSuperman().Fly(), mundo.getSuperman().Land(), mundo.getSuperman().leapBuilding(), mundo.getSuperman().stopBullet(), mundo.getSuperman().Eat());
		interfaz.mostrarSeaPlane(mundo.getSeaplane().takeOff(), mundo.getSeaplane().Fly(), mundo.getSeaplane().Land(), mundo.getSeaplane().Machine(), mundo.getSeaplane().echarGasolina(), mundo.getSeaplane().medirGasolina());
		interfaz.mostrarHelicopter(mundo.getHelicopter().takeOff(), mundo.getHelicopter().Fly(), mundo.getHelicopter().Land(), mundo.getHelicopter().Machine(), mundo.getHelicopter().echarGasolina(), mundo.getHelicopter().medirGasolina());
		
		
	}
}
