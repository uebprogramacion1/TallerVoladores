package Vista;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public Interfaz() {
		
	}
	
	public String pedirDato() {
		return (JOptionPane.showInputDialog(null,"Ingrese un numero para visualizar los metodos \n" + "  1.Avion \n"
						+ "  2.Animal\n" + "  3.Ave\n"+ "  4.Helicoptero\n" + "  5 Kriptoniano\n"+ "  6 HidroAvion\n"
						+ "  7. Superman \n"+ "  8. Vehiculo \n", "Operaciones", JOptionPane.INFORMATION_MESSAGE));
	}

	public void imprimirTexto(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Voladores- Julian Santos", JOptionPane.INFORMATION_MESSAGE);
	}
}
