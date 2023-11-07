package chapter10.collectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class starPractice {

	public static void main(String[] args) {
		
		
		
		
		Scanner st = new Scanner(System.in);
		String Star = " * ";
		int repeat = 5;
		List <String> rs = new ArrayList<String>();
		
		for(int i= 0; i<= repeat; i++) {
			rs.add("*".repeat(i));	
		}
		
		for (int i =0; i <rs.size(); i++) {
			System.out.println(rs.get(i));
		}
		System.out.println();
		rs.forEach(s-> System.out.println(s));
		
		
//		for( int i = 1; i <= repeat ; i++) {
//			StringBuffer s = new StringBuffer();
//			for (int j =0; j < i; j++) {
//				s.append("*");
//			}
//			rs.add(s.toString());
//		}


	}

}
