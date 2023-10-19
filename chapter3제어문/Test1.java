package chapter3제어문;

// 한줄 주석
/*
 * 여러줄 주석
 */
public class Test1 {

	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int score = 90;
		int bonus;
		if (score < 100) {
			bonus = 10;
		}else if (100 < score & score < 200) {
			bonus = 20;
		}
		else
			bonus = 30;
		score += bonus;
		System.out.println();
		
		
	
	}
}
