package ch07_상속.sec10.exam2;

public class AbstractMethodExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}

	//자동 타입 변환
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
