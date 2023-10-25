package chapter4배열;

public class Test38 {

	public static void main(String[] args) {
		int[] [][] arr =new int[3][5][7];
//		int num = 1;
//		System.out.println(arr.length);
//		for(int i = 0; i < arr.length; i++) {
//			for(int j =0; j < arr[i].length; j++) {
//				arr[i][j] = num++;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//				System.out.print("\t");
//			}
//			System.out.println("\n");
//		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][0].length);
	}

}
