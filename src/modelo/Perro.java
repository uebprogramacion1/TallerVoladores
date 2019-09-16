package modelo;

public class Perro extends Animal implements Flyer {

	@Override
	public String takeOff() {
		return "El perro no despegó porque no puede.";
	}

	@Override
	public String land() {
		return "El perro aterrizó a la cama.";
	}

	@Override
	public String fly() {
		return null;
	}
	
	@Override
	public String eat() {
		return super.eat();
	}
	
	public String ladrar() {
		return "El perro ladra, ladra demasiado.";
	}
	

}
