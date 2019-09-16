package modelo;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "We'll take off at 2:30 pm";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "We'll land in some hours";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "We'll be flying at 300 ft above the sea";
	}

}
