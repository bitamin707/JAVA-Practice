package ch08_인터페이스.sec04;

public interface RemoteControl {
	//상수 필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; //public static final 생략 가능
	
	//추상 메소드
		void turnOn();
		void turnOff();
		void setVolume(int volume);
		
		//디폴트 인스턴스 메소드
		default void setMute(boolean mute) {
			if(mute) {
				System.out.println("무음 처리합니다.");
				//추상 메소드 호출하면서 상수 필드 사용
				setVolume(MIN_VOLUME);
			}
			else {
				System.out.println("무음을 해제합니다.");
			}
		}
}
