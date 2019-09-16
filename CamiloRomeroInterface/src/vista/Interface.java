package vista;

import javax.swing.JOptionPane;
import modelo.Mundo;

public class Interface {
	public Interface() {
	}
	public String getPreguntaGeneral() {

		return JOptionPane.showInputDialog("objeto a analizar: \n 1. aviones" + " \n 2. heroes" + " \n 3. aves");
	}

	public String getPreguntaAviones() {

		return JOptionPane.showInputDialog("pieza a analizar :\n 1. sea plane  " + "\n 2. helicoptero");
	}
	
	public String getPreguntaSalida() {
		
		return JOptionPane.showInputDialog("Decision: \n1.Usar el programa \n2.Salir \nOtro numero dara continuidad al programa");
	}
	
	public int obtenerSelecion(String dato) {

		return Integer.parseInt(dato);
	}
	
	
}