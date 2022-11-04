package ch07_상속.sec10.exam1;

public class PhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone(); //추상 클래스 선언 불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
	
}
