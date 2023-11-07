package chapter08;

public class MyLinkedListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList2 myList= new MyLinkedList2();
		myList.print();
		myList.add("JAVA");
		myList.add("JSP");
		myList.add("Servlet");
		myList.print();
//		System.out.println("=============================");
//		
		myList.add("JAVA","C++");
//		myList.delete("Python");
	}
}
