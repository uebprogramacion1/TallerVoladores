package Modelo;

public class Bird extends Animal implements Flyer {

	@Override
	public String takeOff() {

		return " Bird TakeOff";
	}

	@Override
	public String land() {

		return "Bird Land";
	}

	@Override
	public String fly() {

		return " Bird Fly";
	}

	public String buildNest() {

		return " Bird build Nest";
	}
	public String layEggs() {

		return " Bird Lay Eggs";
	}
}
