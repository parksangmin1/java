package chapter08;

public class MyLinkedList {
	// 시작 노드의 참조(주소) 값 
	private Node head = null;
	
	public class Node {
		//데이터를 저장하는 필드 변수 
		private String data;
		//현재 노드에 연결된 다음 노드 참조값을 저장하는 참조변수
		private Node link;
		
		
		public Node(String data) {
			this.data = data;
		}
	}
	// 스텍에 만들어지는 건 참조변수!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 
	public void add(String data) {
//		       스텍          힙
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			// 헤드에 이미 설정되어 있다. list가 한개이상 존재함
			// 시작 변수값을 next에 설정 why? head는 변하면 안되기 떄문에 새로 가공할 변수에 담는다.
			Node next = head;
			while(next.link != null) {
				//next에 연결된 노드가 있는 동안 루프
				next = next.link;
			}
			//리스트의 끝 노드에 도착
			//다음 연결 노드로 newNode를 설정 
			next.link = newNode;
		}
	}
	public void print() {
		if(head ==null) {
			System.out.println("등록된 데이터가 없습니다");
		} else {
			
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			//현재 노드에 next가 null이 아닌 동안 루프
			while(next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}
