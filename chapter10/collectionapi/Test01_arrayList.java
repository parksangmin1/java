package chapter10.collectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Test01_arrayList {

	public static void main(String[] args) {
		
		Random r1 = new Random();
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("김씨", 30);
		Student s1 = new Student("김씨", r1.nextInt(20,30), "컴공");
		Professor pr1 = new Professor("ddd", 20, "수학");
		
		pr1.setName("홍길동");
		pr1.setAge(40);
		list.add(pr1);
		Professor pr2 = new Professor("ㅇㅇㅇ", 30, "음악");
		pr2.setName("박씨");
		pr2.setAge(50);
		list.add(pr2);
		
		
//		for (int i = 1 ; i <= 10; i++) {
//			Student s = new Student();
//			s.setName("김씨");
//			s.setAge(r1.nextInt(20, 30));
//			s.setMajor("컴공과");
//			list.add(s);
//		}
		
//		list.forEach(pr1 -> System.out.println(pr1));
		
		
	}

}
