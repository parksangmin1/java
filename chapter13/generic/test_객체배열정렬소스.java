
package chapter13.generic;

import java.util.Arrays;
import java.util.Random;
class Student implements Comparable<Student>{
	String sno;
	String sname;
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
		
	}
	@Override
	public String toString() {
		System.out.println();
		return "(sno  "+ "  sname   )";
	}
	@Override
	public int compareTo(Student s) {
		//왼쪽이 크면 양수 같으면 0 작으면 음수 
		int result = this.sno.compareTo(s.sno);
		return result;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
}
public class test_객체배열정렬소스 {

	static void sortStudent(Student[]data) {
		Student temp = null;
		for (int i = 0; i < data.length;i++) 
			for (int j = i + 1; j < data.length; j++)
			{
				if(data[i].compareTo(data[j]) > 0)
				temp = data[i]; data[i] = data[j]; data[j] = temp;
			}
	}
	
	public static void main(String[] args) {
		Student [] data = {
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍")
		};
		for (Student st: data)
//			System.out.print(" " + st);
			sortStudent(data);
//		Arrays.sort(data);//이게 문제가 있어서 sortStudent()를 구현
		
	}

}
