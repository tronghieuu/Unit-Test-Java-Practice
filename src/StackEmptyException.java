package stack;

public class StackEmptyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackEmptyException(String message) {
        super(message);
    }
     
    @Override
    public String getMessage() {
        return "StackEmptyException: " + super.getMessage();
    } 
}
