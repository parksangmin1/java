package chapter12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("이름을 입력하세여");
			String name = br.readLine();
			System.out.println("Hello" + name);
			
		} catch (Exception e) {
			e.printStackTrace();
			}
	}

}
//  읽어온 스트림을 buffer에 바이트들을 한번에 출력 해줌 
// 왜쓰냐? 버퍼에 바이트가 찰 동안에 cpu는 다른 작업을 할 수 있음.
// 이 기능을 fillterStream이라고 한다 !
