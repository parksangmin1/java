package chap2_기본자료구조;

import java.util.Arrays;
import java.util.Random;

public class test_정수배열정렬 {

	static void sort(int[] data) {
		int temp = 0;
		for(int i =0; i<data.length; i++) 
			for(int j = i +1; j< data.length; j++) {
			if (data[i] > data[j]) {
				swap(data, i, j);
			}
		}
	}
	static void swap(int[] data, int idx1, int idx2 ) {
		int tmp = data[idx1];
		data[idx1] = data[idx2];
		data[idx2] = tmp;
		System.out.println("data1 = " + data[idx1]);
	}
public static void main(String[] args) {
	int [] data = new int[20];
	Random rnd = new Random();
	for (int i = 0; i < data.length; i++)
		data[i] = rnd.nextInt(10);
//	Arrays.sort(data);
	//출력 
	System.out.println(Arrays.toString(data));
	System.out.println("수정후::");
	sort(data);
	System.out.println("정렬 후 ");
	System.out.println(Arrays.toString(data));
}
}
