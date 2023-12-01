package chap3_검색알고리즘;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData>{
	public PhyscData(String string, int i, double d) {
		this.name = string;
		this.height = i;
		this.vision = d;
	}
	String name;
	int height;
	double vision;
	@Override
	public int compareTo(PhyscData o) {
		if(this.getName().compareTo(o.getName())!=0) {
			return this.getName().compareTo(o.getName());
		}
		if(this.getName().compareTo(o.getName()) ==0) {
			return this.getHeight() - o.getHeight();
		}else if(this.getHeight() == o.getHeight()) {
			return (int) ((this.getVision()*10) - (o.getVision()*10));
			
		}
		return height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getVision() {
		return vision;
	}
	public void setVision(double vision) {
		this.vision = vision;
	}
	@Override
	public String toString() {
		return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
	}
	
}
public class Test_실습3_6_1객체배열이진탐색 {

	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("홍길동", 162, 0.3),
				new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7),
				new PhyscData("김홍길동", 172, 0.3),
				new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2),
				new PhyscData("길동", 167, 0.5),
		};
		
		showData(data);
		sortData(data);
		System.out.println("정렬 후 ");
		showData(data);
//		PhyscData key = new PhyscData("길동", 167, 0.2);
//		int result = linearSearch(data, key);
//		System.out.println("\nlinearSearch(): result = " + result);
		
		PhyscData key = new PhyscData("길동", 167, 0.5);
		int result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}

	private static int binarySearch(PhyscData[] data, PhyscData key) {
		int pl = 0;
		int pr = data.length-1;
		
		do {
			int pc = (pl+pr) /2;
			if(data[pc].compareTo(key) ==0) {
				return pc;
			}
			if(key.compareTo(data[pc]) >0) {
				pr = pc -1;			
			}else if(key.compareTo(data[pc]) < 0) {
				pr = pc -1;
			}
		}while (pl <= pr);
		return -1;
	}

	private static int linearSearch(PhyscData[] data, PhyscData key) {
		for(int i = 0 ; i< data.length; i++) {
			if(data[i].compareTo(key) == 0) {
				return i;
			}
		}
		return 0;
	}

	private static void sortData(PhyscData[] data) {
		PhyscData temp;
		for(int i =0; i < data.length; i++)
			for(int j = i+1; j< data.length; j++) {
				if(data[i].compareTo(data[j]) > 0) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		
	}
	static void showData(PhyscData[]data) {
	for(PhyscData da: data ) {
		System.out.println(da);
	}
		
	}


}