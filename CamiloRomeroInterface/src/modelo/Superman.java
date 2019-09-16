package modelo;

public class Superman extends Kriptonian implements Flyer {
	
	public Superman () {
	
		
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "SuperMan come";
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "se quita la capa";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "aterriza";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "vuela";
	}
	
	public String leapBuilding() {
		
		return "salta del edificio";
	}
	
	public String stopBullet() {
		
		return "detiene una bala";
	}

}
