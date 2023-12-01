package chap3_검색알고리즘;

// linked list, tree hashes
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Test_실습3_4정수배열이진탐색 {

	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		System.out.println(data);
		showData(data);
		sortData(data);
		System.out.println(data);
		for (int num: data) {
			System.out.print(num+" ");
		}
//		int key = 33;
//		int dLength = data.length;
//		int result = linearSearch(data,dLength  ,key);
//		System.out.println("\nlinearSearch(): result = " + result);

		int key = 39;
		int dLength = data.length;
		int result = binarySearch(data,dLength ,key);
		System.out.println("\nbinarySearch(): result = " + result);

//		int idx = Arrays.binarySearch(data, ,key);
//		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

	private static int linearSearch(int[] data,int dLength, int key) {
		for (int i = 0; i<dLength; i++ )
			if(data[i] == key)
				return i;
		
		return -1;
	}
	private static int binarySearch(int[] data,int dLength,int key) {
		int pl = 0;
		int pr = dLength -1;
	
		do {
			int pc = (pl + pr) /2;
			if (data[pc] == key)
				return pc;
			else if(data[pc] < key)
				pl = pc +1;		
			else
				pr = pc -1;
		}while (pl <= pr);
		return -1;
	}

	private static void sortData(int[] data) {
		int temp;
		for(int i =0; i<data.length; i++)
			for(int j = i+1; j<data.length; j++) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
	}

	private static void showData(int[] data) {
		for(int da : data) {
			System.out.print(da + "");
		}
		
	}

	private static void inputData(int[] data) {
		Random r1 = new Random(); 
		for(int i = 0; i < data.length; i++) {
			data[i] = r1.nextInt(100); 
		}
		
	}

}
