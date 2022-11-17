package ch11_예외처리.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void depsoit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientException {
		if(balance < money)
			throw new InsufficientException("잔고 부족 : " + (money - balance) + "원이 모자람");
		
		balance -= money;
	}
}
