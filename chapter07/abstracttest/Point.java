package chapter07.abstracttest;

public class Point  extends Geometry{
	Point(int x, int y) {
		addPoint(x, y);
	}
	Point(){}
	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
