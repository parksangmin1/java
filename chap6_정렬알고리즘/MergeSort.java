package chap6_정렬알고리즘;

import java.util.Random;

public class MergeSort {

	static int[] buff; //작업용 배열
	
	static void __mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int i;
			int center = (left + right) /2;
			int p = 0;
			int j = 0;
			int k = left;
			
//			__mergeSort(a, left, right,left +1, right1);
			__mergeSort(a, left, center);
			__mergeSort(a, center +1, right);
			
			for (i = left; i <=center; i++)
				buff[p++] = a[i];
			
			while (i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++]: a[i++];
			
			while(j < p)
				a[k++] = buff[j++];
		}
	}
	static void mergeSort(int[] a, int n ) {
		buff = new int[n];
		__mergeSort(a, 0, n-1);
		buff = null;
	}
	public static void main(String[] args) {
	
		Random rn = new Random();
		int[] x = new int[10];
		
		for( int i =0; i< x.length; i++) {
			System.out.println("x[" +i +"]:");
			x[i] = rn.nextInt(100);
		}
		
		mergeSort(x, x.length);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i< x.length; i++)
			System.out.println("x [" + i + "] =" +x[i] );
	}

}
