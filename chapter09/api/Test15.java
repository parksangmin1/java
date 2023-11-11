package chapter09.api;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		
		int [] arr = new int[10];
		
		for(int i= 0; i< 10; i++) {
			arr[i] = r1.nextInt(10);
			
		}
		
//			System.out.println(r1.nextInt()+"\t");
//			System.out.println(r1.nextInt(10)+"\t");
//			System.out.println(r1.nextBoolean()+"\t");
//			System.out.println(r1.nextDouble()+"\t");
//			System.out.println();
		

		for(int num: arr) {
			System.out.print(" " + num);
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
