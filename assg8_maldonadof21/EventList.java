package assg8_maldonadof21;

import java.util.*;

public class EventList{
	
	private ArrayList<Event> eve;
	
	public EventList() {
		eve = new ArrayList<Event>();
	}
	
	/*
	 * Removes first element of array list
	 */
	public void remove() {
		eve.remove(0);
	}
	
	/*
	 * inserts an event in the list then sorts it
	 */
	public void insertEvent(Event insert) {
		eve.add(insert);
		Collections.sort(eve);
	}
	
	/*
	 * Retrieves first event
	 * @return the first event
	 */
	public Event retrieve() {
		return eve.get(0);
	}
	
	/*
	 * method checks if the event is empty
	 */
	public boolean isEmpty() {
		if(eve.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}

