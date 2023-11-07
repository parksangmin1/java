package chapter10.collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> arr = new ArrayList<>();
			arr.add("서울"); arr.add("북경"); arr.add("상해");
			arr.add("서울"); arr.add("도쿄"); arr.add("뉴욕");

			
			
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
//			람다식 14장
			arr.forEach(s->System.out.println("fe:"+ s));	
			
		
			arr.add("런던"); arr.add("로마"); arr.add("방콕");
			arr.add("북경"); arr.add("도쿄"); arr.add("서울");
			System.out.println("1: " + arr.toString());
			System.out.println("===============================================");
			arr.add(1, "LA"); print(2, arr);
			
			System.out.println("3:" + arr.indexOf("서울"));
			System.out.println("4:" + arr.lastIndexOf("서울"));
			
			
			arr.remove("LA"); print(5, arr);
			arr.remove(2); print(6, arr);
			
			System.out.println("7:" + arr.contains("LA"));
			Object obj[] = arr.toArray();
			System.out.println("8:" + Arrays.toString(obj));
			
			String cities[] = new String[0];
			cities = arr.toArray(cities);
			System.out.println("9:" + Arrays.toString(cities));
			
			
			arr.clear(); print(10, arr);
			
			System.out.println("11:" + arr.isEmpty());
			
			arr.add("파리");
			arr.add("방콕");
			arr.add("LA");
			
			List<String> arr2 = Arrays.asList("서울", "뉴욕", "상해");
			print(12, arr2);
			
			arr.addAll(arr2); print(13, arr);
			
			System.out.println("14:" + arr.containsAll(arr2));
			
			arr.retainAll(arr2); print(15, arr);
			arr.removeAll(arr2); print(16, arr);
			
			
	}
	public static void print(int n, List<String> arr) {
		System.out.println(n + ":" + arr);
	}
}
