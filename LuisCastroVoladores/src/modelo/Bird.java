package modelo;

public class Bird extends Animal implements Flyer{

	@Override
	public String eat() {
		return "los pajaros comen semillas";
		// TODO Auto-generated method stub
		
	}
	
	public String takeOff() {
		return "despega todso los dias";
	}
	public String land() {
		return"aterriza suavemente";
	}
	public String fly() {
		return"vuela agitando las alas";
	}
	
	public String LayEggs() {
		return"pone 2 huevos";
	}
	public String buildNets() {
		return"tiene tres nidos";
	}
}
