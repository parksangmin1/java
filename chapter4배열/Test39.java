package chapter4배열;

public class Test39 {

	public static void main(String[] args) {
		int[] [] arr =new int[10][5];
		int num = 1;
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		// 배열의 대각 합을 구해서 설정
		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j =0; j < arr[i].length; j++) {
//				if (1 == j ) sum += arr[i][j];
//				
//			}
		
//		}
		
		for (int i = 0; i <arr.length && i < arr[0].length ; i++)
			sum += arr[i][i];
		
		System.out.println("합:" + sum);
	}

}
