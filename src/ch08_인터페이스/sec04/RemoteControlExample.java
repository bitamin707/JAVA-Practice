package ch08_인터페이스.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//Television 객체 생성하고 인터페이스 변수 대입
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio 객체 생성하고 인터페이스 변수 대입		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(100);
		rc.turnOff();
	}

}
