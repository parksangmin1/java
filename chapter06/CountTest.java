package chapter06;

class Count {
	public static int totalCount;
	int count;
	
}


public class CountTest {
	public void dowork() {
	System.out.println(Count.totalCount);
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;
		Count.totalCount++;
		c2.count++;
		Count.totalCount++;
		c3.count++;
		Count.totalCount++;
		
		System.out.println(Count.totalCount + ":" + c1.count);
		System.out.println(Count.totalCount + ":" + c2.count);
		System.out.println(Count.totalCount + ":" + c3.count);
	}
	public static void main(String[] args) {
	// 메인에서 선언없이 다른 매소드를 쓰려면 새로운 인스턴스를 만들어서 호출
		CountTest ct = new CountTest();
		ct.dowork();
	
	}
}
