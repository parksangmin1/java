package chapter07.abstact;

import chapter07.inheritance.Employee;
// 추상 매서드는 인스턴스를 생성할 수 없다 
// 추상 매서드를 왜 쓰냐? 구현을 전부 다 하지 않고 넘겨받는 클레스에서 구현을 강제하기 위해서!
abstract class employee{
	
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
	
}

	class Salesman extends Employee {
		public void calcSalaty() {
			System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 *12 *4");
	}
}
	
	class Consultant extends Employee {
		public void calcSalary() {
			System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
		}
		public void calcBonus() {
			System.out.println("Consultant 보너스 = 기본급 *12 *12");
			
		}
	}
	
	abstract class Manager extends Employee {
		public void calcSalart() {
			System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		}
	}
	
	class Director extends Manager {
		public void calcBonus() {
			System.out.println("Director 보너스 = 기본급 *12 *6");
		}
	}
	
	public class HRSTest {
		public static void main(String[] args) {
			Salesman s = new Salesman();
			Consultant c = new Consultant();
			Director d = new Director();
			
			s.calcBonus();
			c.calcBonus();
			d.calcBonus();
			
		
			
		}
	}
