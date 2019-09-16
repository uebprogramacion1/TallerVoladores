package modelo;

public class Mundo {

	private SeaPlane seaplane;
	private Bird bird;
	private Superman superMan;
	private Helicopter helicopter;

	public Mundo() {

		seaplane = new SeaPlane();
		bird = new Bird();
		superMan = new Superman();
		helicopter = new Helicopter();

	}

	public String darDatosSeaplane() {

		return seaplane.fly() + " \n" + seaplane.land() + " \n" + seaplane.takeOff();
	}

	public String darDatosBird() {

		return bird.eat() + " \n" + bird.fly() + " \n" + bird.land() + " \n" + bird.takeOff() + " \n" + bird.layEggs()
				+ "\n " + bird.buildNest();
	}

	public String darDatosSuperMan() {

		return superMan.eat() + " \n" + superMan.fly() + " \n" + superMan.land() + " \n" + superMan.leapBuilding();
	}

	public String darDatosHelicopter() {

		return helicopter.fly() + " \n" + helicopter.land() + " \n" + helicopter.takeOff() + " \n"
				+ helicopter.takeOff();
	}

}