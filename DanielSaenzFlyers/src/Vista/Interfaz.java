package Vista;


import javax.swing.JOptionPane;

public class Interfaz {

	public Interfaz() 
	{
		// TODO Auto-generated constructor stub
		
	}

	/* metodo de prueba que pide un dato por JOptionPane y retorna el String correspondiente
	 * Reemplazar por lo que se necesiten
	 */
	
	public String pedirDato(String mensaje) 
	{
		return (JOptionPane.showInputDialog(null, mensaje,"Elija una opcion",JOptionPane.INFORMATION_MESSAGE));
	}
	
	
	/* metodo de prueba que imprime un dato procesado por un método declarado en 
	 * Reemplazar por lo que se necesiten
	 */

	public void escribirDato(String mensaje,String dato) 
	{
		JOptionPane.showMessageDialog(null, mensaje +dato, "Taller", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public int mostrarMenu(String[] menu) {
		
		 int a= 0;
		
		String respuesta ="";
		
		for(int i = 0; i<menu.length;i++) {
			respuesta += menu[i] + "\n";
			
		}
		a=Integer.parseInt(JOptionPane.showInputDialog(respuesta));
		return a;
	}
	
}