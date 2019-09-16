package Modelo;

public class Pajaro extends Animal implements FLYER {

	@Override
	public String takeOff() {
		String p = "El pajarito Esta Aterrizando";
		return p;
	}

	@Override
	public String Land() {
		String o = "El pajarito Esta Aterrizando ";
		return o;
	}

	@Override
	public String Fly() {
		String s = "El pajarito Esta voladondo";
		return s;
	}
public String construirNidos() {
	String g = "El pajarito Esta Contruyendo un nido";
	return g;
	
}
public String layEggs() {
	String j = "El pajarito Pone Huevos";
	return j;
}

@Override
  public String Eat() {
	String eat = "El pajarito  Esta comiedo";
	return eat;
}

}
