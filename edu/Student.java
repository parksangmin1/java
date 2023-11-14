package edu;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {

	private String sno;
	private String name;
	private String city;
	
	public Student(String sno, String name, String city) {
		this.sno = sno;
		this.name = name;
		this.city = city;
		
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("1", "홍교수님", "부산");
		Student st2 = new Student("2", "이상현교수님", "뉴욕");
		Student st3 = new Student("3", "교육생", "서");
		
//		Student[] st1 = new Student[3];
//		
//		st1[0].sno = "2";
//		st1[1].sno = "1";
//		st1[2].sno = "3";
//		
//		for(String st : st1) {
//			
//		}
		
		
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


	