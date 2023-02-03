package activity8;

public class Node {
	
	int item;
	Node next;
	
	public Node(int newitem) {
		this.item = newitem;
		this.next = null;
	}
	
	public Node(int newitem, Node newNode) {
		this.item = newitem;
		this.next = newNode;
	}
	

}
