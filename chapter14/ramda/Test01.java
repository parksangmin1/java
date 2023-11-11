package chapter14.ramda;


interface MyInterface {
	public void print();
	
	
}
class MyClass1 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass2의 객체");
	}
}
class MyClass2 implements MyInterface{
	@Override
	public void print() {
		System.out.println("MyClass2의 객체");
	}
}

public class Test01{
	//방법 4: 함수 매개변수로 익명클래스 사용
	static void test(MyInterface mi) {
		System.out.println("함수에서 메소드 호출");
		
	}
	
	static MyInterface test2() {
		MyInterface mi2 = new MyInterface() {
			@Override
			public void print() {
				System.out.println("메소드의 리턴 값이 인터페이스 객체");
			}
		};
		return mi2;
	}
	static MyInterface test3() {
		return new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("hello");
				
			}
		};
	}
	public static void main(String[] args) {
		//방법 1
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();
		mc2.print();
		
		
		//방법 2 익명클래스 사용
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명클래스 사용");
			}
		};
			mi.print();
			
			
			
			// 방법 3: 클래스 선언 , 객체 생성 ,  method호출을 한번에 처리 
			(new MyInterface() {
				@Override
				public void print() {
					System.out.println("선언, 생성, 호출을 한번에 처리");
				}
			}).print();
			test(mi);
			//방법 5
//			mi2.print();
			
			//일반 인터페이스
			MyInterface m = test3();
			m.print();
			
			MyInterface m2 = ()->System.out.println("hell");
			m2.print();
		}
	}



	

	
