package chapter07.inheritance;

public class Student extends Person {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  major;
	}
}
