package chapter11.exception;

public class exam {
	
	public void d() {
		throw new IndexOutOfBoundsException("에러가 발생했습니다.");
//		코드 안읽는 영역~~~~~~~
	}
	public void c()throws Exception {
		
			System.out.println("C1");
			int y = 10 /0;
			System.out.println("C2");
			d();
			System.out.println("C finally");		
	}
public void b() throws Exception {
	System.out.println("C3");
	c();
	System.out.println("C4");
	}
public void a() {
	System.out.println("C5");
	try {
		b();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("오류발생: " + e.getMessage());
	}
	System.out.println("C6");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exam exam = new exam();
		exam.a();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fine!");
	}

}

