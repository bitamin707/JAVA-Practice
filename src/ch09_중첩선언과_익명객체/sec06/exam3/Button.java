package ch09_중첩선언과_익명객체.sec06.exam3;

public class Button {
	//정적 중첩 인터페이스
	public static interface ClickListener {
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//Button이 클릭되었을 때 실행
	public void click() {
		this.clickListener.onClick();
	}
}
