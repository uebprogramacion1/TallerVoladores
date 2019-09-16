package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {
	
	private Mundo bd;
	
	private Interfaz gui;
	
	public Controlador() {
		
		bd = new Mundo();
		gui = new Interfaz();
		
		try {	
			
			int  opc = Integer.parseInt(gui.pedirDato());
			
			if(opc == 1)
			{
				
				bd.getA().takeOff();
				bd.getA().fly();
				bd.getA().land();
				gui.imprimirTexto("A volar");
			}
			

			if(opc == 2)
			{
				bd.getAn().eat();
				gui.imprimirTexto("Animal");
			}
			
			if(opc == 3)
			{
				bd.getB().takeOff();
				bd.getB().fly();
				bd.getB().land();
				bd.getB().buildNest();
				bd.getB().layEggs();
				bd.getB().eat();
				gui.imprimirTexto("Mira las acciones del ave");
			}
			if(opc == 4)
			{
				bd.getH().PrendiendoMotores();
				gui.imprimirTexto("A volar con el helicoptero");
			}
			if(opc == 5)
			{
				bd.getK().eat();
				bd.getK().darPoderes();
				bd.getK().SuperVuelo();
				gui.imprimirTexto("Mira las acciones del Kryptoniano");
			}
			if(opc == 6)
			{
				bd.getS().VolarenAgua();
				gui.imprimirTexto("A volar con el hidroplano");
			}
			if(opc == 7)
			{
				bd.getSu().eat();
				bd.getSu().takeOff();
				bd.getSu().fly();
				bd.getSu().land();
				bd.getSu().leapBulding();
				bd.getSu().stopBullet();
				
				gui.imprimirTexto("Mira las acciones del Superman");
			}
			if(opc == 8)
			{
				bd.getV().Cabina();
				bd.getV().MostrarAeroplanos();
				bd.getV().Motores();
				
				gui.imprimirTexto("Vamos a verficar los vehiculos");
			}
		}
			
				catch (Exception e) {
					System.out.println("No se puede iniciar el vuelo");

		}	
	}
}

	

