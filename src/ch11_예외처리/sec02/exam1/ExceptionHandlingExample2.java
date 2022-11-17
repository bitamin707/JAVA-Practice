package ch11_예외처리.sec02.exam1;

public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try {
		int result = data.length();
		System.out.println("문자 수 : " + result);
		}
		catch(NullPointerException e) {
//			System.out.println(e.getMessage()); //예외 발생 이유 출력
//			System.out.println(e.toString()); //예외 이유와 종류 출력
			e.printStackTrace(); //예외 추적 내용 출력
		}
		finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		
		printLength("This is Java");
		printLength(null);
		
		System.out.println("\n[프로그램 종료]");
	}

}
