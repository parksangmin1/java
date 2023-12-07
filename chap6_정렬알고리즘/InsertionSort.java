package chap6_정렬알고리즘;

public class InsertionSort {

	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp =a[i];
			for (j = i; j >0 && a[j -1] > tmp; j--)
				a[j] = a[j -1];
			a[j] = tmp;
		}
	}
	public static void main(String[] args) {
		

	}

}
