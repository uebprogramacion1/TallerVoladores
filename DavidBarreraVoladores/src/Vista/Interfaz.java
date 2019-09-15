package Vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void MostrarAirplane(String Cadena) {
		JOptionPane.showMessageDialog(null, Cadena, " Interface Airplane ", JOptionPane.INFORMATION_MESSAGE);
	}
	public void MostrarHelicopter(String Cadena) {
		JOptionPane.showMessageDialog(null, Cadena, " Interface Helicopter ", JOptionPane.INFORMATION_MESSAGE);
	}
	public void MostrarSuperman(String cadena) {
		JOptionPane.showMessageDialog(null, cadena, " Interface Superman", JOptionPane.INFORMATION_MESSAGE);
	}

	public void MostrarBird(String cadena) {
		JOptionPane.showMessageDialog(null, cadena, " Interface Bird", JOptionPane.INFORMATION_MESSAGE);
	}
}
