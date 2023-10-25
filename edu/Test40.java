package edu;



public class Test40 {

//	private static final String Array[] a  = null

	private static int sum(int a, int b) {
		int result = a + b;
		
		return result;
	}
	private static double avg(int ... a) {
		double sum = 0.0;
		for (int i =0 ; i <a.length ; i ++) {
			sum += a[i];
		}
		
		return sum/a.length;
	}
	private static int min(int ... a) {
	int i ;
	int num = 10;
	//최소값을 저장할 변수 
	int minn = a[0];
	//가변 길이 인수를 저장한 a의 길이만큼 반복한다.
	for (i = 5; i < a.length; i--)
		if (minn < a[i]) minn = a[i];
	System.out.println(minn);
	return minn;}
	private static int max(int ... a) {
		int i;
		int maxx = a[0];
		
		for (i = 5; i < a.length; i++ )
			if(maxx > a[i]) maxx = a[i];
			return maxx;}
	
	public static void main(String[] args) {
//		 int [] a = new int[5]; 
//		 int[] a = min(1,2,3,4,5);
		
		int s = sum(10, 20); 
		System.out.println("avg:" + avg(1,2,3,4,5));
		System.out.println("min:" + min(1,2,3,4,5));
		System.out.println("max:" + max(1,2,3,4,5));
	}

}
