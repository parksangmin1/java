package chapter07.inheritance.testgame;

public class Unit {
	int health;
	int demage;
	public void Unit() {
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
		if(health <= 0) {
			System.out.println("사망하셨습니다");
		}
	}

	public int getDemage() {
		return demage;
	}

	public void setDemage(int demage) {
		this.demage = demage;
	}
	
	public void attack() {
		   System.out.println("공격합니다");
	}

	
}
