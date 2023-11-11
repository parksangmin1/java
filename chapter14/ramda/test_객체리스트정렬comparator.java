package chapter14.ramda;

import java.util.ArrayList;

//클레스에 구현한게 아니라 인터페이스에 구현 
// 인터페이스에 뉴 객체를 만들면? 익명클래스가 만들어지고 객체를 만들어서 comp에 담음 
/*
 * public interface Comparator<T>{
 *    int compare(T 01, T 02);
 *    }
 *    
 * public interface Comparable<T> {
 *   public int compareTo(T o);
 *   }   
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
class Student2 {
	public Student2(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	String sno;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	String sname;
	@Override
	public String toString () {
		return"("+ sno + "  +  " + sname + ")";
	}

}
public class test_객체리스트정렬comparator {
	static void sortStudent(
			List<Student2> data, 
//			Student2 [] data,
			Comparator<Student2> comp) {
		Student2 temp;
		for (int i = 0; i < data.size();i++) 
			for (int j = i + 1; j < data.size(); j++)	{
//				if (data[i] < data[j] ) {//문제가 발생 :: 객체 비교가 안된다 
//				if (data[i].compareTo(data[j])>0) {
//				if (Integer.parseInt(data[i].sno) > Integer.parseInt(data[j].sno)) {				
//				}
//				}
				if(comp.compare(data.get(i), data.get(j))> 0) {
					temp = data.get(i);
					data.set(i, data.get(j));
					data.set(j, temp); 
			}
			
			}
	}
	public static void main(String[] args) {
		
	
		//sname을 이용한 비교
		Comparator<Student2> compNo = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return Integer.parseInt(s1.getSno()) - Integer.parseInt(s2.getSno()) ;
				
				
				return 0;
			}
		};
		//sno를 이용한 비교 
		Comparator<Student2> compName = new Comparator<Student2>(){
			@Override
			public int compare(Student2 s1, Student2 s2) {
				return Integer.parseInt(s1.getSname()) - Integer.parseInt(s2.getSname()) ;
			}
		};
		List<Student2> al = new ArrayList<Student2>(); 
//				new Student2("12", "홍길동"),
//				new Student2("121", "홍길순"),
//				new Student2("213", "홍길춘"),
//				new Student2("9", "홍길홍")
		
		//ArrayList<Student2> al = new ArrayList<>();
		al.add(new Student2("12","홍길동"));
		al.add(new Student2("121", "홍길순"));
		al.add(new Student2("213", "홍길춘"));
		al.add(new Student2("9", "홍길홍"));

//		sortStudent(data, compName);
		Arrays.sort(al, compName);//이게 문제가 있어서 sortStudent()를 구현
		//Collections.sort(al, compName);
//		Collections.sort(al, new Comparator<Student2>() {
//
//		});
		//Collections.sort(al, (s1, s2) -> Integer.parseInt(s1.sno) - Integer.parseInt(s2.sno));
		/*
		Arrays.sort(data, new Comparator<Student>() {

		});
		*/
		for (Student2 st: al)
			System.out.print(" " + st);
	}


	
}
