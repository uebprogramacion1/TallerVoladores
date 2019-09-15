package modelo;

public class Superman extends Kryptonian implements Flyer{

	public String takeOff() {
		return "Superman se va";
		}

	public String land() {
		return "Llego Superman";
		}

	public String fly() {
		return "Es un avión , No es Superman";
		}
	
	public String leapBuilding() {
		return "Superman salta.";
		}
	
	public String stopBullet() {
		return "Superman nos salva.";
		}

	public String eat() {return super.eat();
	}
	

}
