package Controlador;

import Interfaz.Interfaz;
import modelo.Mundo;

public class Controlador {
	Mundo bd;
	Interfaz gui;
	public Controlador()
	{
		bd= new Mundo();
		gui= new Interfaz();
		gui.Mostar(bd.getSm().eat());
		gui.Mostar(bd.getSm().fly());
		gui.Mostar(bd.getSm().land());
		gui.Mostar(bd.getSm().takeOff());
	
		gui.Mostar(bd.getS().fly());
	}
}
