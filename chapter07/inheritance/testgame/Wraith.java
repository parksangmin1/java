package chapter07.inheritance.testgame;

public class Wraith extends Unit {
	int damege;
	
	public Wraith(int a, int b) {
		health = a;
		damege = b;
	}

	public int getDamege() {
		return damege;
	}

	public void setDamege(int damege) {
		this.damege = damege;
	}
	
}
