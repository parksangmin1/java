package chapter5;

public class Test1 {
	public static int f(int x) {
		int value;
		value = 2*x *x +4 *x +5;
		return value;
	}
	public static void main(String[] args) {
		int y;
		y = f(2);
		System.out.println("y = " + y);
		Armor arm = new Armor();
		arm.name = "홍길동";
		arm.weight = 18;
		arm.color = "red";
	}
}
