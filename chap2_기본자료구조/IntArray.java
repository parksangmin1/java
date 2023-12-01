package chap2_기본자료구조;

import java.util.Random;
import java.util.Scanner;

public class IntArray {
	static int MaxOf(int[] a) {
		int max = a[0];
		for(int i =1; i<a.length; i++) {
			if(a[i] > max) {
				max =a[i];
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int []b = {1,2,3,4,5};
		int result = MaxOf(b);
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int []a = new int[num];
		for( int i = 0; i< num; i++) {
			a[i] = rand.nextInt(100);
		}
		for(int n: a )
			System.out.println(n + " ");
		//int []a = b;
	}

}
