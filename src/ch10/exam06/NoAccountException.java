package ch10.exam06;
//예외클래스 작성
public class NoAccountException extends RuntimeException {
	public NoAccountException() {}
	public NoAccountException(String message) {
		super(message);
	}
}
