package chapter3제어문;

public class Test30 {

	public static void main(String[] args) {
	int i = 6;
	if (i%2 == 0) {
		System.out.println("6은 2의 배수이다");
		if (i%3 == 0) {
			System.out.println("6은 3의 배수이다");
		}
	}
		
	for ( i = 0; i < 10; i++)
		for ( int j = 0; j<10; j++)
			System.out.println(i*j);

	}

}
