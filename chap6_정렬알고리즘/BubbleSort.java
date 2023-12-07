package chap6_정렬알고리즘;

import java.util.Random;

public class BubbleSort {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		int exchg = 0;
		for (int i = 0; i < n -1; i++) {
			for(int j = n-1; j >i; j--)
			if(a[j-1] > a[j]) {
				swap(a, j -1, j);
				exchg++;
			}
			if (exchg == 0) break;
			}
	}
	static void bubbleSortk(int[] a, int n) {
		int k = 0;
		while (k < n-1) {
			int last = n -1;
			for (int j =n -1; j > k; j--)
				if(a[j -1] > a[j]) {
					swap(a, j-1, j);
					last = j;
				}
			k = last;
		}
	}
	public static void main(String[] args) {
		Random rn = new Random();
		int[] x = new int[10];
		
		for(int i = 0; i <x.length; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = rn.nextInt(100);
		}
		
//		bubbleSort(x, x.length);
		bubbleSortk(x, x.length);
		System.out.println("오름차순으로 정렬했습니다");
		for ( int i = 0; i< x.length; i++)
			System.out.println("x[" + i + "]= " + x[i]);

	}

}
