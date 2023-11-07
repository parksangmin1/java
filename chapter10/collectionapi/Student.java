package chapter10.collectionapi;

public class Student extends Person {
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		
	}

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
