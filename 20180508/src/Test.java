import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Animal aaa;
		
		Dog tina = new Dog();
		tina.sing();
		
		tina = new Dog();
		tina.eat();
		
		int a = (int)3.1; // 형변환(type casting)
		/*
			상향 형변환(upcasting)
			
			우변의 클래스가 좌변의 클래스의 subclass이면 문제가 발생하지 않는다. 좌변 <-- 우변 
			overriding한 메소드를 호출하면 subclass의 메소드를 호출한다. 
		*/
		aaa = new Dog(); // aaa = (Animal) new Dog();
		aaa.sing();
		
		aaa = new Cat();
		aaa.sing();
		/*
			다형성(ploymorphism)
			
			1. 여러 Subclass를 만들 경우
			2. 모든 Subclass는 Superclass의 메소드를 override한다. 
			3. Superclass refVer = new Subclass();
			4. refVer.overridingMethod()
			Subclass의 overriding method를 호출한다. 
		 */
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog"))
			aaa = new Dog();
		else
			aaa = new Cat();
		aaa.sing(); // 동적 바인딩(dynamic binding): 프로그램 수행 시 호출할 메소드를 결정한다. 
		
		// 추상 클래스는 객체를 만들 수 없다. 
		// aaa = new Animal(); Error!
		// aaa.sing(); Error!
		
	}

}