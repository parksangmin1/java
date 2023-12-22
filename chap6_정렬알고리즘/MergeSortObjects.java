package chap6_정렬알고리즘;

public class MergeSortObjects    {
static class PhyscData implements Comparable <PhyscData> {
	private String name;
	private Integer height;
	private double vision; 
	public PhyscData(String string, int i, double d) {
		this.name = string;
		this.height = i;
		this.vision = d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
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
	public int compareTo(PhyscData o) {
		if(this.name.compareTo(o.name) == 0) {
			if(this.height - (o.height) > 0) {
				return 1;
			}else if(this.height.compareTo(o.height) < 0)
				return -1;
			else {
				return 0;
			}
		}else if(this.name.compareTo(o.name) > 0){
			return 1;			
		}else {
			return -1;
		}
	}
		// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
		static void merge(PhyscData[] a, int lefta, int righta, int leftb, int rightb ) {
			int i;
			int n = a.length;
			PhyscData[] buff = new PhyscData[10];
			int p = 0;
			int j = 0;
			int k = lefta;
			for( i = lefta; i<= righta; i++) {
				buff[p++] = a[i];
			}
			while (i <= (rightb) && j < p) {
				a[k++] = (buff[j].compareTo(a[i]) <=0) ? buff[j++]: a[i++]; 
				System.out.println("k=" + k + "j = " + j + "i=" + i);
			}
			while (j<p)
				a[k++] = buff[j++];
		}

		// --- 퀵 정렬(비재귀 버전)---//
		static void MergeSort(PhyscData[] a, int left, int right) {
			int mid = (left+right)/2;
			if (left == right) return;
			MergeSort(a, left, mid);
			MergeSort(a, mid+1, right);
			merge(a, left, mid, mid+1, right);
			return;
		}

		public static void main(String[] args) {
			PhyscData[] x = {
					 new PhyscData("강민하", 162, 0.3),						 
			         new PhyscData("박준서", 171, 2.0),
			         new PhyscData("유서범", 171, 1.5),
			         new PhyscData("이수연", 168, 0.4),
			         new PhyscData("장경오", 171, 1.2),
			         new PhyscData("황지안", 169, 0.8),
			         new PhyscData("김찬우", 173, 0.7),		        			         
			     };
			int nx = x.length;

			   MergeSort(x, 0, nx - 1); // 배열 x를 퀵정렬
				System.out.println("오름차순으로 정렬했습니다.");
			     System.out.println("■ 신체검사 리스트 ■");
			     System.out.println(" 이름     키  시력");
			     System.out.println("------------------");
			     for (int i = 0; i < x.length; i++)
			         System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
	
	}




}
