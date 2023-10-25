package chapter07.inheritance.testgame;

public class Tank extends Unit {
	int health;
	int damege;
	
	public Tank(int a, int b) {
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
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println("포를 쏩니다");
	}
	public void attacked(Marine marine) {
		super.setHealth(super.getHealth() - 30); 
	}
}
