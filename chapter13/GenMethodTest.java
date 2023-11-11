package chapter13;

public class GenMethodTest {
//메인에서 부르는 함수를 만들때 static으로 선언해서 씀 
	//오토 박싱으로 가능한거 임 자바 컴파일러가 자동으로 정수 버전 더블버전의 코드를 생성해줌
	static <T extends Number , V extends T > boolean isInclude(T num, V[] array) {
		for(int i =0; i < array.length; i++) {
			if(array[i] == num)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inum = {1, 2, 3, 4, 5};
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] snum = {"one", "two", "three", "four", "five"};
		
		boolean b1 = isInclude(3, inum);
		System.out.println("결과: " +b1);
		
		boolean b2 = isInclude(5.0, dnum);
		System.out.println("결과: " +b2);
		
//		boolean b3 = isInclude("one");
//		isInclude("one" , snum);
		
		GenMethodTest.<Integer, Integer>isInclude(3, inum);
		GenMethodTest.<Double, Double>isInclude(5.0, dnum);
//		GenMethodTest.<String, String>isInclude("one", snum);
		
		
	}

}
