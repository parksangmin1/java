package chapter09.api;

import java.util.StringTokenizer;

public class Test14 {

	public static void main(String[] args) {
		
		String msg = "Although the world is full of suffering, it is full also of the overcoing of";
		
		StringTokenizer st1 = new StringTokenizer(msg);
		System.out.println("단어 수 :" +st1.countTokens());
		
		System.out.println("================");
		String s = "id=guest&name=Amy&pwd=1004";
		
		StringTokenizer st2 = new StringTokenizer(s, "&");
		//nextToken()을 쓰면 다음커서로 이동 
		while(st2.hasMoreTokens()) {
			System.out.println("남아있는 토큰 수 :" + st2.countTokens());
			System.out.println(st2.nextToken());
			
		}
		
		System.out.println("================");
		// "=&" 이오게 되면 분리자가 두개로 돼서 = & 둘다 기준으로 끊어줌
		StringTokenizer st3 = new StringTokenizer(s, "=&");
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}

}
