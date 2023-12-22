package chap6_정렬알고리즘;

import java.util.Random;

public class ShellSort {
	
	static void shellSort(int[] a, int n) {
		for( int h = n /2; h > 0; h/=2)
			for (int i =h; i < n; i++) {
				int j;
				int tmp = a[i];
				for(j = i - h;j >= 0 && j >= 0 && a[j] > tmp; j -=h)
					a[j +h] = a[j];
				a[j + h] = tmp;
			}
	
	}
	public static void main(String[] args) {
	
		Random rn = new Random();		
		int[] x = new int[10];
		
		for ( int i = 0; i< x.length; i++) {
			System.out.print("x["+ i +"]");
			x[i] = rn.nextInt(100);
		}
		shellSort(x, x.length);
		System.out.print("오름차순으로 정렬 했습니다");
		for(int i = 0; i < x.length; i++)
			System.out.print("x["+ i +"]" + x[i]);
	}
}
