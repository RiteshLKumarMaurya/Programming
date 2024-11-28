package putils;

public class NotEligibleNumber extends Exception{
	private String message;
	
	public NotEligibleNumber(String message)
	{
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
