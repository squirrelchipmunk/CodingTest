package test;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class MyLinkedList {
	private Node head;
	private int size;

	public MyLinkedList() {
		head = null;
		size = 0;
	}


	public Node add(Node node) {
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		this.size++;
		return node;
	}
	
	public Node add(Node node, int position) {
		Node n = head;

		if(position == 1) {
			node.next = head;
			head = node;
		}
		else {
			for(int i=1; i<position-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		
		this.size++;
		return node;
	}
	
	
	public Node getNode(int position) {
		Node n = head;
		for(int i=1; i<position; i++) {
			n = n.next;
		}
		return n;
	}
	
	public Node remove(int position) {
		if(head == null || position > size)
			return null;
			
		Node n = head;
		Node prev = null;
		
		if(position==1) {
			head = head.next;
			return n;
		}
		
		for(int i=1; i<position; i++) {
			prev = n;
			n = n.next;
		}
		
		prev.next = n.next;
		size--;
		
		return n;
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public boolean contains() {
		return true;
	}
	
}

public class 링크드리스트구현 {
	public static void main(String[] args) {
		MyLinkedList lnkList = new MyLinkedList();
		Node node = new Node(10);
		lnkList.add(node);
		
		Node node2 = new Node(20);
		lnkList.add(node2);
		
		Node node3 = new Node(30);
		lnkList.add(node3);
		
		Node node4 = new Node(40);
		lnkList.add(node4);
		lnkList.printList();
		
		Node node5 = new Node(7);
		lnkList.add(node5,1);
		
		lnkList.printList();
		
		
		lnkList.remove(3);
		lnkList.printList();
		
		
	}

}
