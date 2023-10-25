package chapter06;

public class Member {
	private String name;
	private int age;
	private String hobby;
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Member() {
		System.out.println("Member 기본 생성자가 호출되었습니다");
	}
	
	public Member(String name) {
		System.out.println("Member 생성자1이 호출되었습니다");
	}
//	public Member(String hobby) {
//		System.out.println("Member 생성자1이 호출되었습니다");
//	}
	public Member(int age) {
		System.out.println("Member 생성자2가 호출되었습니다");
	}
	public Member(String name, int age) {
		System.out.println("Member 생성자3이 호출되었습니다");
	}
	
	public static void main(String[] args) {
		Member a = new Member();  //기본 생성자
		Member a1 = new Member("홍"); 
		Member a2 = new Member(20);
		Member a3 = new Member("홍", 20);
	}
	
	
}
