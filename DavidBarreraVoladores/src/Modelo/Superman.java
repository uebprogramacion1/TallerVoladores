package Modelo;

public class Superman extends  Krytonian implements Flyer {

	@Override
	public String takeOff() {
		return "Superman TakeOff";
	}

	@Override
	public String land() {
		return "Superman Land";
	}

	@Override
	public String fly() {
		return "Superman Fly";
	}

	public String LeapBuilding() {
		return " Superman Leap Building";
	}
	public String stopBullet() {
		return "  Stop Bullet";
	}
}
