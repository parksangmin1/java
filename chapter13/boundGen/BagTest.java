package chapter13.boundGen;

class Bag<T extends Solid> {
	//오브젝으로 선언해서 에러가 안남
	private T thing;
	private String owner;
	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public void setThing(T thing) {
		this.thing = thing;
	}


	public Bag(T thing) {
		this.thing = thing;
	}
	

	public Object getThing() {
		return thing;
	}
	
	public void setThhing(T thing) {
		this.thing = thing;
		
	}
	//물음표 사용가능!!!!! 와일드 카드!!!!! 
	boolean isSameOwner(Bag<?> obj) {
	if(this.owner.equals(obj.getOwner()))
		return true;
	return false;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}	
	
class Solid {}
class Liquid{}

class Book extends Solid {}
class PencilCase extends Solid{}
class Notebook extends Solid{}

class Water extends Liquid{}
class Coffee extends Liquid{}
public class BagTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
	
//		Bag<Water> bag4 = new Bag<>(new Notebook());
//		Bag<Coffe> bag5 = new Bag<>(new Coffee());
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		
		boolean result =bag.isSameOwner(bag2);
		if(result) System.out.println("소유자가 동일합니다");
		else System.out.println("소유자가 다릅니다");
		
		//Book 캐스팅 없으면 에러
		Book book = (Book) bag.getThing();
		PencilCase pc = (PencilCase) bag2.getThing();
		Notebook nb = (Notebook) bag3.getThing();
		
		
	
	}

}