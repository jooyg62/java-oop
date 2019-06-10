package exception;

public class MyException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public MyException() {
		super("MyException Occurs.....");
	}
	
	public MyException(String message) {
		super(message);
	}
}
