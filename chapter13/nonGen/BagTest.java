package chapter13.nonGen;

class Bag {
	//오브젝으로 선언해서 에러가 안남
	private Object thing;
	
	public Bag(Object thing) {
		this.thing = thing;
	}
	

	public Object getThing() {
		return thing;
	}
	
	public void setThhing(Object thing) {
		this.thing = thing;
		
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}	
	
class Book {}
class PencilCase {}
class Notebook {}

public class BagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bag bag = new Bag(new Book());
		Bag bag2 = new Bag(new PencilCase());
		Bag bag3 = new Bag(new Notebook());
		//Book 캐스팅 없으면 에러
		Book book = (Book) bag.getThing();
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook) bag3.getThing();
		
		//오브젝으로 선언해서 !!
		bag = bag2;
	}

}
