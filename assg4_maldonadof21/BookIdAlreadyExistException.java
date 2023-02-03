package assg4_maldonadof21;

@SuppressWarnings("serial")
public class BookIdAlreadyExistException extends Exception{
	
	/**
	 * @super
	 */
	public BookIdAlreadyExistException() {
		super("Book Already Exist");
	}
	
	/**
	 * @super
	 * @param message
	 */
	public BookIdAlreadyExistException(String message) {
		super(message);
	}
	
}
