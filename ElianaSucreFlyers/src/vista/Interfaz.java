package vista;

import javax.swing.JOptionPane;

public class Interfaz {
	public void mostrarDato(String cadena) {
		JOptionPane.showMessageDialog(null, cadena, "Resultado", JOptionPane.INFORMATION_MESSAGE); // null porque no se
																									// llama ningun
																									// objeto, cadena,
																									// titulo, tipo de
																									// mensaje
	}
}
