package chapter07.inheritance.testgame;

public class Marine extends Unit {
	int health;
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	int damege;
	
	public Marine (int a, int b) {
		this.health = a;
		this.damege = b;
	}

	public int getDamege() {
		return damege;
	}

	public void setDamege(int damege) {
		this.damege = damege;
	}
	
}
