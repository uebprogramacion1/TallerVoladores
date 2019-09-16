package modelo;

public class Superman extends Kryptonian implements Flyer {

	public Superman() {

	}

	public String leapBuilding() {
		return "Yo vuelo sobre las torres";

	}

	public String stopBullet() {
		return "Yo detengo las balas";
	}

	@Override
	public String takeOff() {
		return "Take off superman!";
	}

	@Override
	public String land() {
		return "Yo aterrizo con mis piernas";
	}

	@Override
	public String fly() {
		return "¿Es un avión? ¿Es un pajaro? ¡No! Soy YO volando";
	}

}
