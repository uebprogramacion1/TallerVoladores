package modelo;

public class Superwoman extends Kryptonian implements Flyer {

	public String superPowers() {
		return "My powers include strength and lfying";
	}

	@Override
	public String takeOff() {

		return "lets go flying high!";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "Land save";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Fast as an airpalne";
	}

}
