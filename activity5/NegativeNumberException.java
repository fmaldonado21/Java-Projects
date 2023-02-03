package activity5;

public class NegativeNumberException extends Exception{
		
	public NegativeNumberException() {
		super("Number cannot be Negative");
	}
	
	public NegativeNumberException(String message) {
		super(message);
	}
	
}
