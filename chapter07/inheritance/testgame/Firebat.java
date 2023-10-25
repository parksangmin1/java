package chapter07.inheritance.testgame;

public class Firebat extends Unit {
	int health;
	int damege;
	
	public Firebat(int a, int b)  {
		health = a;
		damege = b;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamege() {
		return damege;
	}

	public void setDamege(int damege) {
		this.damege = damege;
	}
	
}
