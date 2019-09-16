package modelo;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public String takeOff() {
		return "salgo del cielo :v";
		
	}

	@Override
	public String land() {
		return "tierra";
		
	}

	@Override
	public String fly() {
		return "vuelo como el viento";
		
	}

	@Override
	public String eat() {
		return "como carne y mujeres";
		
	}
	public String leapBuilding()
	{
		return "salto con los pies";
	}
	public String leapBuilding(String a)
	{
		if (a.equalsIgnoreCase("volar")) {
			return "esquivo edificio volando";
		}
		return null;
	}
	public String leapBuilding (String a, String b)
	{
		if(a.equalsIgnoreCase("Spiderman")&&b.equalsIgnoreCase("telaraña"))
		{
			return "esquivo edificios con la telañara de jesus";
		}
		return null;
	}
	public void stopBullet()
	{
		
	}

}
