package chapter07.abstracttest;

public class Line extends Geometry{

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		
		int[] xArr = getxArr();
		int[] yArr = getyArr();
		return yArr[0] - xArr[0];
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
