package com.ruby.java.test2;
import com.ruby.java.test1.*;
public class exam01 {

	public static void main(String[] args) {
		Armor arm = new Armor();
		arm.setHeight(100);
		arm.height = 99;
		
		int result = arm.takeOff();
		arm.speedUp(100);
		int speed = arm.getSpeed();
//		System.out.println(arm.speed);
//		System.out.println(arm.name);
//		System.out.println(arm.height);
		
		arm.show();
		arm.speedUp(99);
//		arm.test();
		arm.test(1);
		arm.test(1, 2);
		arm.test(1, 2, 3);
	}
}
