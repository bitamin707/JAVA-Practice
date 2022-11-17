package ch11_예외처리.sec06;

public class InsufficientException extends Exception {
	//생성자
	public InsufficientException() {}
	public InsufficientException(String message) {
		super(message); 
	}
}
