package chapter10.collectionapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class practice {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random r1 = new Random();
		r1.nextInt(101);
		int arr[] = new int[100];
//		내가한거 
//		int sum = 0;
//		int avg = 0;
//		int min = 0;
//		int max = 0;
//		for(int i=0; i<100; i++) {
//			arr[i] = r1.nextInt(100);
//		}
//		// 값 계산
//		int dmin = 101;
//		int dmax = 0;
//		for(int num: arr) {
//			sum += num;
//			avg = sum / 100;
//			if(num < dmax) {
//				min = num;
//			}
//			if(num > dmin) {
//				max = num;
//			}
//			
//			
//			
//		}
//		System.out.println("총점" + sum);
//		System.out.println("평균" + avg);
//		System.out.println("최대" + max);
//		System.out.println("최소" + max);
//		교수님 풀이 
		for (int i = 0; i < 100 ; i++) {
			list.add(r1.nextInt(101));
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < list.size(); i++) {
			if(max < list.get(i)) max = list.get(i);
			if(min > list.get(i)) min = list.get(i);
			sum += list.get(i);
		}
		avg = sum / list.size();
		
		
		System.out.println("합" + sum);
		System.out.println("평균" + avg);
		System.out.println("최대" + max);
		System.out.println("최소" + min);

	}

}
