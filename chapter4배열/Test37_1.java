package chapter4배열;

import java.util.Scanner;

public class Test37_1 {

	public static void main(String[] args) {
//		int[] score = { 90, 85, 78, 100, 98};
	Scanner sc = new Scanner(System.in);
		int [] score = new int[5];
//		System.out.println("국어 점수 : ");
//		score[0] = sc.nextInt();	
//		System.out.println("국어 점수 : ");
//		score[1] = sc.nextInt();
//		System.out.println("국어 점수 : ");
//		score[2] = sc.nextInt();
//		System.out.println("국어 점수 : ");
//		score[3] = sc.nextInt();
//		System.out.println("국어 점수 : ");
//		score[4] = sc.nextInt();
//		
	
		for (int i = 0 ; i < score.length; i++) {
			System.out.println("점수("+(i+1) + "/" + score.length +"): ");
			score[i] = sc.nextInt();
		}
		
		
		int sum = 0;
		double avg = 0.;
		int max = 0;
		int min =999;
		
		
		for(int i = 0; i< score.length; i++) {
			sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];			
		}
		avg = sum / score.length;
		System.out.println("총 점 : " + sum);
		System.out.println("총 점 : " + avg);
		System.out.println("총 점 : " + max);
		System.out.println("총 점 : " + min);
	}

}
