package chapter4배열;

import java.util.Scanner;

public class Test32 {

	public static void main(String[] args) {
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		
//		int r = 0;
//		for( r = 0; r < 5; r++)
//			System.out.println(arr[r]);
//		

//		System.out.println(arr[r]);
		
		Scanner sc = new Scanner(System.in);
//		
		
		int arr[] = new int[3];
		
		System.out.println("국어 점수 : ");
		arr[0] = sc.nextInt();
		System.out.println("영어 점수 : ");
		arr[1] = sc.nextInt();
		System.out.println("수학 점수 : ");
		arr[2] = sc.nextInt();
	
		for (int i = 0; i < 3 ; i++) {
			System.out.println(arr[i]);
		}
		int avg = (arr[0] + arr[1] + arr[2])/3;
		System.out.println("평균은" +avg);
	}

}
