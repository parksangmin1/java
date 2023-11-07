package chapter08;

//import chapter07.inheritance.Employee;
// 추상 매서드는 인스턴스를 생성할 수 없다 
// 추상 매서드를 왜 쓰냐? 구현을 전부 다 하지 않고 넘겨받는 클레스에서 구현을 강제하기 위해서!
 class Employee{
	
	String name;
	int salary;
	
	public  void calcSalary() {};
	public  void calcBonus() {};
	
}

	class Salesman extends Employee {
		int annual_sales;
		public void calcSalaty() {
			System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 *12 *4");
	}
	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		
	}
}
	
	class Consultant extends Employee {
		int num_project;
		public void calcSalary() {
			System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
		}
		public void calcBonus() {
			System.out.println("Consultant 보너스 = 기본급 *12 *12");
			
		}
	}
	
	 class Manager extends Employee {
		 int num_team;
		public void calcSalart() {
			System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
		}
	}
	
	class Director extends Manager {
		public void calcBonus() {
			System.out.println("Director 보너스 = 기본급 *12 *6");
		}

		@Override
		public void calcSalary() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public class HRSTest {
		public static void main(String[] args) {
//			Salesman s = new Salesman();
//			Consultant c = new Consultant();
//			Director d = new Director();
//			
//			Salesman s2 = s;
//			
//			Employee e3 = new Employee();
//			Salesman s4 = (Salesman)e3;
//			
//			System.out.println(s2.toString());
//			System.out.println(s.toString());
//			System.out.println(c.toString());
//			System.out.println(d.toString());
//			
//			if(s.equals(s2)) {
//				System.out.println("동일한 객체입니다");
//			} else {
//				System.out.println("서로 다른 객체입니다");
//			}
//			
//			Object m1 = new Manager();
//			Employee m2 =new Manager();
//			Manager m3 = new Manager();
//			Director m4 =new Manager(); // 오류발생 디랙터는 매니저 아래클레스인데 담을려고 해서~ 
			
			
			Salesman s1 = new Salesman();
			Employee s2 = new Salesman();
			Object s3 = new Salesman();
			
			
			Object m1 = new Manager();
			Employee m2 = new Manager();
			Manager m3 =new Manager();
			
			
			Object arr[] = new Object[6];
			arr[0] = s1;
			arr[1] = s2;
			arr[2] = s3;
			arr[3] = m1;
			arr[4] = m2;
			arr[5] = m3;
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
			
		}
	}
