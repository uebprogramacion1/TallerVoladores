package Modelo;

public abstract class AirPlane extends Vehicle implements Flyer, Gas {
	
	public AirPlane() {
		
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "AirPlane I Take Off";
	}

	@Override
	public String Land() {
		// TODO Auto-generated method stub
		return "AirPlane I Land";
	}

	@Override
	public String Fly() {
		// TODO Auto-generated method stub
		return "AirPlane I Fly";
	}

	@Override
	public String Machine() {
		// TODO Auto-generated method stub
		return "AirPlane I'm A Machine";
	}

	@Override
	public String echarGasolina() {
		// TODO Auto-generated method stub
		return "AirPlane Charging Gas";
	}

	@Override
	public String medirGasolina() {
		// TODO Auto-generated method stub
		return "AirPlane Max Fuel: 70 Lts";
	}

}
