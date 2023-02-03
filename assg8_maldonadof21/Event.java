 package assg8_maldonadof21;

public class Event implements Comparable<Event>{
	
	char type;
	int duration;
	int transactionTime;
	
	/*
	 * Constructor for event
	 * @param aDuration is the arrival
	 * @param transactionTime
	 */
	public Event(int Aduration, int transactionTime) {
		this.type = 'A';
		this.duration = Aduration;
		this.transactionTime = transactionTime;
	}
	
	/*
	 * Constructor for event
	 * @param for departure time
	 */
	public Event(int DdepartureT) {
		this.type = 'D';
		this.transactionTime = 0;
		this.duration = DdepartureT;
	}
	
	/*
	 * this method gets the duration
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	
	/*
	 * this method gets the transaction time
	 * @return the transaction time
	 */
	public int gettransTime() {
		return transactionTime;
	}
	
	/*
	 * method gets the type of flight
	 * @return the type
	 */
	public char getType() {
		return type;
	}
	
	/*
	 * @return the toString
	 */
	public String toString() {
		return "(" + type + "," + duration + "," + transactionTime + ")";
	}
	
	/*
	 * method compares the two objects times
	 */
	public int compareTo(Event event) {
		if(this.duration > event.getDuration()) {
			return 1;
		}
		else if(this.duration == event.getDuration()) {
			if(this.type == 'A' && event.type == 'D') {
				return 1;
			}
			return 0;
		}
		else
			return -1;
	}
	
	/*
	 * this method checks if event is arrival or departure
	 */
	public boolean arrive() {
		if(this.type == 'A') {
			return true;
		}
		else if(this.type == 'D'){
			return false;
		}
		return false;
	}
	
	
}
