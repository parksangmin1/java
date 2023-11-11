package chapter13;


import java.util.Arrays;
import java.util.Random;

public class Test_정수배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] datas = new int[20];
		Random rnd = new Random();
		for (int i = 0; i < datas.length; i++) {
			datas[i] = rnd.nextInt(100); 
		}
		Arrays.sort(datas);

		//출력 
		System.out.println(Arrays.toString(datas));
		}
		
}
