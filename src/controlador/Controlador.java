package controlador;
import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	private Mundo m;
	private Interfaz gui;
	
	public Controlador() {
		
		m = new Mundo();
		gui= new Interfaz();
		
		//AÑADIR TRES CLASES MÁS, UN METODO ASOCIADO A CADA CLASE. Subida a Github.
		
		
				//airplane
				gui.mostrar(m.getAir().arrancar());
				gui.mostrar(m.getAir().takeOff());
				gui.mostrar(m.getAir().land());
				gui.mostrar(m.getAir().fly());
				
				//bird
				gui.mostrar(m.getBir().eat());
				gui.mostrar(m.getBir().fly());
				gui.mostrar(m.getBir().land());
				gui.mostrar(m.getBir().layEggs());
				gui.mostrar(m.getBir().buildNest());
				gui.mostrar(m.getBir().takeOff());
				
				//gallina
				gui.mostrar(m.getGal().cantar());
				gui.mostrar(m.getGal().eat());
				gui.mostrar(m.getGal().fly());
				
				//moto
				gui.mostrar(m.getMot().arrancar());
			
				//perro
				gui.mostrar(m.getPer().eat());
				gui.mostrar(m.getPer().land());
				gui.mostrar(m.getPer().takeOff());
				gui.mostrar(m.getPer().ladrar());
				
				//superman
				gui.mostrar(m.getSup().eat());
				gui.mostrar(m.getSup().fly());
				gui.mostrar(m.getSup().land());
				gui.mostrar(m.getSup().leapBuilding());
				gui.mostrar(m.getSup().stopBullet());
				gui.mostrar(m.getSup().takeOff());
	}
}