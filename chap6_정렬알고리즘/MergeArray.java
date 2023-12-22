package chap6_정렬알고리즘;

import java.util.Random;

public class MergeArray {
//	static int[] buff;
	static void merge(int[] a, int na, int[] b, int nb, int[] c ) {
		int pa = 0;
		int pb = 0;
		int pc = 0;
		
		//작은 쪽 값을 C에 저장
		while(pa < na && pb < nb)
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++]: b[pb++];
		// a에 남아 있는 요소를 복사
		while(pa < na)
			c[pc++] =a[pa++];
//		b에 남아 있는 요소를 복사
		while(pb < nb)
			c[pc++] = b[pb++];
	}
	static void __merge(int[] c, int leng) {
		int i;
		int pl = 0;
		int pr = leng;
		int center = pl + pr/2;
		int p = 0;
		int j = 0;
		int k = pl;
		int [] bufff =new int[13];
		for( i = pl; i<= center; i++)
			bufff[p++] = c[i];
		  // 병합
		while (i <= leng && j <p )
			c[k++] = bufff[j] <= c[i] ? bufff[j++]: c[i++];
		 // 버퍼에 남아있는 요소들을 복사
		while(j <p)
			c[k++] = bufff[j++];
	}
	public static void main(String[] args) {
		
		int[] a = {2, 4, 6, 11, 13};
		int[] b = {1, 2, 3, 4, 16, 21};
		int[] c = new int[13];
		
		System.out.println("두 배열을 병합");
		
		merge(a, a.length, b, b.length, c);
		System.out.println("배열 a와 b를 병합하여 배열 c에 저장했습니다.");
		System.out.println("배열 a:");
		for(int i =0; i < a.length; i++)
			System.out.println("a[" + i + "]=" + a[i]);
		
		System.out.println("배열 b:");
		for ( int i =0; i <b.length; i++)
			System.out.println("b[" + i+ "]=" + b[i]);
		
		System.out.println("배열 c:");
		for(int i =0; i < c.length; i++)
			System.out.println("c[" +i + "] =" + c[i]);
		__merge(c, c.length);							
		System.out.println("배열 c 또 바꿈");
		for(int i =0; i < c.length; i++)
			System.out.println("c[" +i + "] =" + c[i]);
		
	

	}

}
