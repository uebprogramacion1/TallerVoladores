package modelo;

public class Superman extends Kryptonian implements Flyer {

	public Superman() {

	}

	public String leapBuilding() {
		return "Yo vuelo sobre las torres";

	}

	public String stopBullet() {

		return "Must stop the bullet please";
	}

	@Override
	public String takeOff() {
		return "Take off superman!";
	}

	@Override
	public String land() {
		return null;
	}

	@Override
	public String fly() {
		return "Lets fly high";
	}

}
