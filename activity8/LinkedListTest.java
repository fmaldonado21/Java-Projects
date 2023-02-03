package activity8;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		int count = 0;
		Node list = new Node(count++);
		
		for(int i = 0; i < 11; i++) {
			list = new Node(i);
			System.out.println(list.item + " ");
		}
		
		System.out.println("Even Elements Recursive: ");
		for(int i = 0; i < 11; i++) {
			list = new Node(i);
			
			evenElementsRecursive(list);
		}
		
		System.out.println("Even Elements Iterative: ");
		for(int i = 0; i < 11; i++) {
			list = new Node(i);
					
			evenElementsIterative(list);		
		}

		System.out.println("Odd Elements Recursive: ");
		for(int i = 0; i < 11; i++) {
			list = new Node(i);
			
			oddElementsRecursive(list);
		}
		
		System.out.println("Odd Elements Iterative: ");
		for(int i = 0; i < 11; i++) {
			list = new Node(i);
			
			oddElementsIterative(list);
		}
	}
	
	
	public static void evenElementsIterative(Node head) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.item % 2 == 0) {
				System.out.println(temp.item);
			}
			temp = temp.next;
		}
	}
	
	public static void evenElementsRecursive(Node head) {
		Node temp = head;
		
		if(temp == null) {
			return;
		}
		
		if(temp.item % 2 == 0) {
			System.out.println(temp.item);
		}
		
		evenElementsRecursive(temp.next);
	}
	
	public static void oddElementsIterative(Node head) {
		Node temp = head;
		
		while(temp != null) {
			if(temp.item % 2 == 1) {
				System.out.println(temp.item);
			}
			temp = temp.next;
		}
	}
	
	public static void oddElementsRecursive(Node head) {
		Node temp = head;
		
		if(temp == null) {
			return;
		}
		
		if(temp.item % 2 == 1) {
			System.out.println(temp.item);
		}
		
		oddElementsRecursive(temp.next);
	}
	
	
	
	
	
}


