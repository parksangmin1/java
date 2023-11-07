package chapter07.abstracttest;

public class GeoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.addPoint(10, 20);
		p.printPoint();
		System.out.println("점 길이 :" + p.getLength());
		System.out.println("점 면적 :" +p.getArea());
		
		Line line = new Line();
		line.addPoint(10, 20);
		line.addPoint(20, 30);
		line.printPoint();
		System.out.println("길이 :" + line.getLength());
		System.out.println("면적 : " + line.getArea());
		
//		Retangle rect = new Retangle();
//		rect.addPoint(0,0);
//		rect.addPoint(10,0);
//		rect.addPoint(10,10);
//		rect.addPoint(0,10);
//		rect.printPoint();
//		System.out.println("길이 :" + rect.getLength());
//		System.out.println("면적 : " + rect.getArea());
		
	}

}
