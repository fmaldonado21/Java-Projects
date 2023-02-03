package assg4_maldonadof21;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception{
	
	/**
	 * @super
	 */
	public BookNotFoundException() {
		super("Book Not Found! ");
	}
	
	/**
	 * @super
	 * @param message
	 */
	public BookNotFoundException(String message) {
		super(message);
	}
}
