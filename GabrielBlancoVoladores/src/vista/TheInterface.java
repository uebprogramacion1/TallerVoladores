package vista;

import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TheInterface 
{
	public void Information(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Operation Done", JOptionPane.INFORMATION_MESSAGE); //Aviso de finalización de operación
	}
	public void Error(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Error", JOptionPane.ERROR_MESSAGE); //Aviso de error
	}
	public void ExceptionError(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Fatal error has occurred", JOptionPane.ERROR_MESSAGE); //Aviso de Error Fatal que cubre la excepcion.
	}
	public void WarningMessage(String insertyerMessageHere)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Warning", JOptionPane.WARNING_MESSAGE); //Aviso de advertencia
	}
	public String AppInput(InputStream com, String insertyerMessageHere, String title)
	{
		return JOptionPane.showInputDialog(null, insertyerMessageHere, title, JOptionPane.PLAIN_MESSAGE); //Dialogo de entrada
	}
	public void helpMessage(String insertyerMessageHere, ImageIcon icon)
	{
		JOptionPane.showMessageDialog(null, insertyerMessageHere, "Ayuda", JOptionPane.PLAIN_MESSAGE, icon);
	}
}
