package ch06.sec15;

public class SingletonExample {
	
	public static void main(String[] args) {
		//정적 메소드 호출해서 싱글톤 객체 얻음
		Sing obj1 = Sing.getInstance();
		Sing obj2 = Sing.getInstance();
		
		//동인한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
