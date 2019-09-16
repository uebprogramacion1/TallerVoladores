package modelo;

public class Bird extends Animal implements Flyer {

	public String takeOff() {

		return null;
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "landing to take care of my birds";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "Flying to the sun";
	}

	public String buildNest() {
		return "Birds must bill nests";

	}

	public String layEggs() {
		return "laying eggs to become a mother";
	}

}
