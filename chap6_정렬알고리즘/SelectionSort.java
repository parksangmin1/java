package chap6_정렬알고리즘;

import java.util.Random;

public class SelectionSort {

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	private static void selectionSort(int[] a, int n ) {
		for (int i = 0; i < n -1; i++) {
			int min = i;
			for (int j = i +1; j < n ; j++)
				if (a[j] < a[min])
					min = j;
				swap(a, i, min);
		}
	}


	public static void main(String[] args) {
	
		Random rn = new Random();
		int[] x = new int[10];
		
		for(int i = 0; i <x.length; i++) {
			
			x[i] = rn.nextInt(100);
			System.out.println("x["+i +"]:" +x[i]);
		}
			selectionSort(x, x.length);
			for (int i = 0; i< x.length; i++) {
				System.out.println("x [" + i + "]" + x[i]);
		}
	}

}
