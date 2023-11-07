package chapter10.collectionapi;

public class Professor extends Person {
	
	private String subject;
	
	public Professor (String name, int age, String subject) {
//		상위 클래스에서 정의한 필드 값은 슈퍼 매서드로만 부르고 내 클레스에서만 this.으로 추가 
		super(name, age);		
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
//	@Override
//	public void setName(String name) {
//		// TODO Auto-generated method stub
//		super.setName(name);
//	}
//	
//	@Override
//	public void setAge(int age) {
//		// TODO Auto-generated method stub
//		super.setAge(age);
//	}
//	
//	@Override
//	public String getName() {
//		// TODO Auto-generated method stub
//		return super.getName();
//	}
//	@Override
//	public int getAge() {
//		// TODO Auto-generated method stub
//		return super.getAge();
//	}
	
}
