package ch08_인터페이스.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//Television 객체 생성하고 인터페이스 변수 대입
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		rc.getVolume();
		rc.turnOff();
		
		System.out.println();
		
		//Audio 객체 생성하고 인터페이스 변수 대입		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(100);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
	}

}
