package ch08_인터페이스.sec11.exam1;

public class CarEample {

	public static void main(String[] args) {
		//자동차 객체 생성
		Car myCar = new Car();
		
		myCar.run();
		
		//타이어 객체 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		
		myCar.run();
		
	}
	
}
