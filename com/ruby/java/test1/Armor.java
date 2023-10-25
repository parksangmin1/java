package com.ruby.java.test1;

public class Armor {
	public String name;
	public int height;
	public int speed;
	public String color;
	public boolean isFly;
	public void test(int ... v) {
		System.out.println(v.length + " : ");
		for (int x: v) {
			System.out.print(x + " ");
		System.out.println();
			
		}
	}
//	public void test(int a ) {
//		System.out.println("test(int a) 호출");
//	}
//	public void test(int a, int b) {
//		System.out.println("test(int a, int b) 호출");
//	}
	public void show() {
		System.out.println(speed);
		System.out.println(name);
		System.out.println(height);
	}
	public void speedUp(int value) {
		speed += value;
//		System.out.println("정수 스피드 증가");
	}
	public void speedUp(double value) {
		speed += (int) value;
//		System.out.println("실수 스피드 증가");
	}
	public int getSpeed() {
		return speed;
	}
	public void setName() {
		String value = "홍길동";
		name = value;
		
	}
	public void setName(int num) {
		String value = "홍길동";
		name = value;
		
	}
	public void setHeight(int value) {
		if (value > 0) 
		height = value;
		else {
			System.out.println("음수안돼");
		}
	}
	public int takeOff() {
		System.out.println("엔진을 구동하다");
		return height;
		
	}
}
