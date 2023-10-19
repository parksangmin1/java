package chapter3제어문;

public class Testwhile {

	public static void main(String[] args) {
		int i = 1;
//		int j = 1;
//		while (i < 10) { 
//			System.out.print(i+" * "+ j + " = " + i*j + " ");
//			i++;
//		}
		
		do {
			int j = 1;
			do {
				System.out.println(i + "*"+ j+"="+i*j+" ");
				j++;
				
			}while(j < 10);
			System.out.println();
			i++;
		}while(i< 10);
		
	}

}
