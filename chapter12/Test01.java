package chapter12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
// 파일이름은 무조건 퍼블릭
public class Test01 {

	public static void main(String[] args) {
		// new 를 쓴다는건 클레스!  괄호안은 파일이름 
		try( FileInputStream fi = new FileInputStream("a.txt");
				FileOutputStream fo = new FileOutputStream("b.txt");) {
			int c = 0;
			// 파일을 다 읽었으면 -1 
			while((c = fi.read()) != -1) {
				fo.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
// system		.out. 						println
// 클래스  		데이터 타입(스테틱 필드)	 	printStream
// 자바 = api 코딩
// 파일이름 대신에 정수로 파일에 매핑 and 접근
// file descriptor table로 정의 
// 파일 포인터는 추상화를 통해 a -> b -> 처럼 파일 객체에 참조