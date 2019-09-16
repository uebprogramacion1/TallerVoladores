package Modelo;

public class Bird extends Animal implements Flyer {
	
	public Bird() {
		
	}

	@Override
	public String takeOff() {
		// TODO Auto-generated method stub
		return "Bird I Eat";
	}

	@Override
	public String Land() {
		// TODO Auto-generated method stub
		return "Bird I Land";
	}

	@Override
	public String Fly() {
		// TODO Auto-generated method stub
		return "Bird I Fly";
	}
	
	@Override
	public String Eat() {
		// TODO Auto-generated method stub
		return "Bird I Eat";
	}
	
	public String buildNest(){
		return "Bird I Build Nest";
	}
	
	public String layEggs(){
		return "Bird I Lay Eggs";
	}

}
