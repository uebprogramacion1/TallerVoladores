package modelo;

public class SeaPlane extends Airplane{
	public String takeOff() {
		return "soy un yate";

	}

	@Override
	public String land() {
		return "agua";

	}

	@Override
	public String fly() {
		return "volar con drogas";

	}

	@Override
	public String Repostar() {
		// TODO Auto-generated method stub
		return "llenando tanque de combustible :g";
	}

	@Override
	public int Medir() {
		// TODO Auto-generated method stub
		return 98888;
	}

}
