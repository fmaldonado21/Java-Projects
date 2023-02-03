package activity10;

import java.util.*;

import activity8.Node;

public class QueuePractice {

	public static void main(String[] args) {
		
	}
		
		public static void queueTest(Node list) {
			
		}
		
		public static Node listGenerator(int max) {
			
			Node head, current;
			head = new Node(1);
			current = head;
			
			int listcount;
			listcount = 0;
			Random rand = new Random(50);
			
			
			do {
				Node now= new Node(rand.nextInt());
				current.next = now;
				current = now;
				
			}while(listcount != max); 
				return head;
			
			
			
		}

	

}
