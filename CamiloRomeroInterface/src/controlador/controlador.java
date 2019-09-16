package controlador;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.Interface;

public class controlador {
	
	private Mundo bd;
	private Interface gui;
	
	public controlador () {
		bd = new Mundo();
		gui = new Interface();
		
		
		while(gui.obtenerSelecion(gui.getPreguntaSalida()) != 2) {
		
		switch (gui.obtenerSelecion(gui.getPreguntaGeneral())) {
		case 1:
			switch (gui.obtenerSelecion(gui.getPreguntaAviones())) {
			case 1:

				JOptionPane.showMessageDialog(null, bd.darDatosSeaplane());
				break;
			case 2:

				JOptionPane.showMessageDialog(null, bd.darDatosHelicopter());

				break;
			default :
				
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				
			break;
			}
			break;
		case 2:
				JOptionPane.showMessageDialog(null, bd.darDatosSuperMan());
				break;
			
		case 3:

			JOptionPane.showMessageDialog(null, bd.darDatosBird());
			break;
		default :
			
			JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
			
		break;
		
		}
		
		
		}
	}
		}


