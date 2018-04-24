package KJ;

public class Dog extends Animal{

	
	public Dog() { // 디폴트 생성자	
		// 묵시적 수퍼 클래스의 디폴트 생성자 호출 super();
		System.out.println("Dog 디폴트 생성자");
	
	}
	
	public Dog(int a) { // 생성자	
		// 묵시적 수퍼 클래스의 디폴트 생성자 호출 super();
		super(a); // 명시적 수퍼 클래스의 정수형 생성자 호출
		System.out.println("Dog 정수형 생성자");
	
	}
	
}