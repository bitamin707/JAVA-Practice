package ch06_클래스.sec14;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		myCar.setSpeed(50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
	
}
