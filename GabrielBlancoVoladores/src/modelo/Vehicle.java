package modelo;

public class Vehicle implements Flyer
{

	@Override
	public String takeOff() 
	{
		// TODO Auto-generated method stub
		return "is taking off";
	}

	@Override
	public String land() 
	{
		// TODO Auto-generated method stub
		return "is landing";
	}

	@Override
	public String fly() 
	{
		// TODO Auto-generated method stub
		return "is flying";
	}

}
