package modelo;

public class Mariposa extends Animal implements Volador {

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Bate rapidamente sus alas hasta despegar. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Baja lentamente y aterriza en el arbol.";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Mueve rapidamente sus alas para mantener altura.";
	}

	@Override
	public String Comer() {
		// TODO Auto-generated method stub
		return "Come hojas.";
	}
	public String SalirDeCapullo(){
		return"Al estar lista sale del capullo y se vuelve una mariposa.";
	}

}
