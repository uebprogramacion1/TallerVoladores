package controlador;

import modelo.World;
import vista.TheInterface;

public class Controller 
{
	private World world = new World();
	private TheInterface theinterface = new TheInterface();
	
	public Controller()
	{
		run();
	}
	
	public void bird(String pAction)
	{
		pAction = theinterface.AppInput(System.in, "What should do the bird?", "GB-FLYERS: Bird");
		switch(pAction)
		{
			default:
				theinterface.Error("The action "+pAction+" does not exist.");
				break;
			case("eat"):
				theinterface.Information("The bird "+world.getBird().eat());
				break;
			case("fly"):
				theinterface.Information("The bird "+world.getBird().fly());
				break;
			case("land"):
				theinterface.Information("The bird "+world.getBird().land());
				break;
			case("take off"):
				theinterface.Information("The bird "+world.getBird().takeOff());
				break;
		}
	}
	
	public void helicopter(String pAction)
	{
		pAction = theinterface.AppInput(System.in, "What should do the helicopter?", "GB-FLYERS: Helicopter");
		switch(pAction)
		{
			default:
				theinterface.Information("The action "+pAction+" does not exist.");
				break;
			case("fly"):
				theinterface.Information("The helicopter "+world.getHelicopter().fly());
				break;
			case("land"):
				theinterface.Information("The helicopter "+world.getHelicopter().land());
				break;
			case("take off"):
				theinterface.Information("The helicopter "+world.getHelicopter().takeOff());
				break;
		}
	}
	
	public void seaplane(String pAction)
	{
		pAction = theinterface.AppInput(System.in, "What should do the seaplane?", "GB-FLYERS: Seaplane");
		switch(pAction)
		{
			default:
				theinterface.Information("The action "+pAction+" does not exist.");
				break;
			case("fly"):
				theinterface.Information("The Seaplane "+world.getSeaplane().fly());
				break;
			case("land"):
				theinterface.Information("The Seaplane "+world.getSeaplane().land());
				break;
			case("take off"):
				theinterface.Information("The Seaplane "+world.getSeaplane().takeOff());
				break;
		}
	}
	
	public void superman(String pAction)
	{
		pAction = theinterface.AppInput(System.in, "What should do Superman?", "GB-FLYERS: Superman");
		switch(pAction)
		{
			default:
				theinterface.Information("The action "+pAction+" does not exist.");
				break;
			case("fly"):
				theinterface.Information("Superman "+world.getSuperman().fly());
				break;
			case("land"):
				theinterface.Information("Superman "+world.getSuperman().land());
				break;
			case("takeoff"):
				theinterface.Information("Superman "+world.getSuperman().takeOff());
				break;
			case("eat"):
				theinterface.Information("Superman "+world.getSuperman().eat());
				break;
			case("leap building"):
				theinterface.Information("Superman "+world.getSuperman().leapBuilding());
				break;
			case("stop bullet"):
				theinterface.Information("Superman "+world.getSuperman().stopBullet());
				break;
		}
	}
	
	public void run()
	{
		boolean active = true;
		while(active == true)
		{
			try 
			{
				String command = theinterface.AppInput(System.in, "\"0\" to quit\n\"bird\" to make the bird do any action.\n\"helicopter\" to make the helicopter do any action.\n\"seaplane\" to make the seaplane do any action.\n\"superman\" to make Superman do any action.", "Gabriel Blanco - Flyers");
				switch(command)
				{
					default:
						theinterface.Error(command+" does not exist.");
						break;
					case("0"):
						active = false;
						break;
					case("bird"):
						bird(command);
						break;
					case("helicopter"):
						helicopter(command);
						break;
					case("seaplane"):
						seaplane(command);
						break;
					case("superman"):
						superman(command);
						break;
				}
			} 
			catch (Exception e) 
			{
				theinterface.ExceptionError(e.toString());
			}
		}
	}
}
