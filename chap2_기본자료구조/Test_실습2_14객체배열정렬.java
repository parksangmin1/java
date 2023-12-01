package chap2_기본자료구조;

class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;
	public PhyscData2(String string, int i, double d) {
		this.name = string;
		this.height = i;
		this.vision = d;
	}
	/**
	 *
	 */
	@Override
	public int compareTo(PhyscData2 o) {
		return this.getName().compareTo(o.getName());
		
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
		return "PhyscData2 [name=" + name + ", height=" + height + ", vision=" + vision + "]";
	}

}
public class Test_실습2_14객체배열정렬 {

	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("홍동", 164, 1.3),
				new PhyscData2("홍길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2),
				new PhyscData2("최길동", 169, 0.5),
		};
		showData(data);
		sortData(data);
		System.out.println("정렬후 ~~~~~~~~~~~~~~~~~~~~~~~~~~");
		showData(data);
		
	}

	private static void sortData(PhyscData2[] data) {
		PhyscData2 temp;
		for(int i = 0; i< data.length; i++)
			for(int j = i+1; j< data.length; j++) {
				if(data[i].compareTo(data[j]) >0) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		
	}

	private static void showData(PhyscData2[] data) {
		for(PhyscData2 s : data) {
			System.out.println(s);
		}
		
	}


}