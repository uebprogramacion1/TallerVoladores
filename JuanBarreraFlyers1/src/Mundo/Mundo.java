package Mundo;

public class Mundo {
	
	private Bird bi;
	private Airplane ai;
	private Superman sp;
	
	public Mundo(){
		bi = new Bird();
		ai = new Airplane();
		sp = new Superman();
		
	}

	public Bird getBi() {
		return bi;
	}

	public void setBi(Bird bi) {
		this.bi = bi;
	}

	public Airplane getAi() {
		return ai;
	}

	public void setAi(Airplane ai) {
		this.ai = ai;
	}

	public Superman getSp() {
		return sp;
	}

	public void setSp(Superman sp) {
		this.sp = sp;
	}

}
