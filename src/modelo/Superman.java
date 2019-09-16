package modelo;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public String takeOff() {
		return "Superman despegó a toda velocidad.";
	}

	@Override
	public String land() {
		return "Superman ha aterrizado.";
	}

	@Override
	public String fly() {
		return "Superman ha volado.";
	}
	
	public String leapBuilding() {
		
		return "Superman saltó un edificio.";
	}
	public String stopBullet() {
		return "Superman detuvo una bala";
	}


}
