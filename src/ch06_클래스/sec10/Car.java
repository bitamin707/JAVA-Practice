package ch06_클래스.sec10;

public class Car {
	//인스턴스 필드 선언
	int speed;
	
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	//정적 메소드
	static void simulate() {
		//객체 생성
		Car myCar = new Car();
		
		//인스턴스 멤버 사용
		myCar.speed = 100;
		myCar.run();
	}
	
	public static void main(String[] args) {
		//정적 메소드
		simulate();
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 80;
		myCar.run();
	}
}
