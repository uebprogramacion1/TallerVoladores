package Modelo;

public class SuperMan extends Animal implements Flyer {

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "SuperMan I Take Off";
	}

	@Override
	public String Land() {
		// TODO Auto-generated method stub
		return "SuperMan I Land";
	}

	@Override
	public String Fly() {
		// TODO Auto-generated method stub
		return "SuperMan I Fly";
	}
	
	@Override
	public String Eat() {
		// TODO Auto-generated method stub
		return "SuperMan I Eat";
	}
	
	public String leapBuilding(){
		return "SuperMan I Leap Building";
	}
	
	public String stopBullet(){
		return "SuperMan I Stop Bullets";
	}

}
