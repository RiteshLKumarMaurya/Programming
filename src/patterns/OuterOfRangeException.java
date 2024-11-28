package patterns;

public class OuterOfRangeException extends Exception{
	private String message;
	
	public OuterOfRangeException(String mesaage) {
		this.message=mesaage;
	}
	
	public String getMessage() {
		return message;
	}
}
