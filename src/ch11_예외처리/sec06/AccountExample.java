package ch11_예외처리.sec06;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();
		
		account.depsoit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(1000);
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(50000);
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("예금액 : " + account.getBalance());
		
	}

}
