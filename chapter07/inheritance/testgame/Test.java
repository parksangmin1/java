package chapter07.inheritance.testgame;

public class Test {

	public static void main(String[] args) {
		
		Marine mr = new Marine(50, 5);
		Firebat fb = new Firebat(60, 6);
		Tank Tn = new Tank(150, 30);
		Wraith wr = new Wraith(150, 15);
		
		Tn.attack();
		
		
	}

}
