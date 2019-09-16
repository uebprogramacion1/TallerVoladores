package modelo;

public class Gato implements Animal,Amigable {
	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "maullare hasta que me des comida";
	}

	@Override
	public String amigo() {
		// TODO Auto-generated method stub
		return "oh, sigues aqui";
	}
}
