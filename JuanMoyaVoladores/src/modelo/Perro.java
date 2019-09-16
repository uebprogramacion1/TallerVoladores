package modelo;

public class Perro implements Animal,Amigable {

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "robando la comida del refrigerador";
	}

	@Override
	public String amigo() {
		// TODO Auto-generated method stub
		return "siendo un buen perro";
	}

}
