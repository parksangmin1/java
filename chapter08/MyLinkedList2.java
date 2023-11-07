package chapter08;



public class MyLinkedList2 {
	private Node head = null;
	
	private class Node {
		private String data;
		private Node prev;
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public void add(String data) {
		Node newNode = new Node(data);
		// head 에 주소값 100으로 예를 들면 포인터 값만 갖고 있음
//		
		if(head == null) {
			head = newNode;
		} else {
			Node next = head;
			// stack 괄호 밖에 사라짐
			while(next.next != null) {
				next = next.next;

			}
//			newNode는 주소값
			next.next = newNode;
			newNode.prev = next;
		}
	}
	public void add(String prev, String data) {
		Node node = find(prev);
		if (node == null)
			add(data);
		else {
			Node newNode = new Node(data);
			newNode.prev = node;
			newNode.next = node.next;
			node.next.prev = newNode;
			node.next= newNode;
		}
	}
	private Node find(String prev) {
		// TODO Auto-generated method stub
		return null;
	}
	public void print() {
		if(head ==null) {
			System.out.println("등록된 데이터가 없습니다");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while(true) {
				System.out.println(next.data);
				if (next.next == null)
					break;
				next = next.next;
			}
		System.out.println("-".repeat(20));
		while (next != null) {
			System.out.println(next.data);
			next = next.prev;
		}
		}
	}
	public void delete(String data) {
		Node node = find(data);
		
		Node p = node.prev;
		Node n = node.next;
		if (p != null && n != null) {
			p.next = n;
			p.prev = p;
			
		}else {
			if (p == null) {
				n.prev = null;
				head = n;
			}
			if (n== null) {
				p.next = null;
			}
		}
		
		
	}
}
