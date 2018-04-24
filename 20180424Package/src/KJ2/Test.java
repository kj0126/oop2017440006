package KJ2;

import KJ1.*;

public class Test {

	public static void main(String[] args) {
		
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		// aBasil.age = 2; Error! age is a private field;
		
		/*
			다른 패키지의 클라스를 사용하려면
			1. 패키지명.클래스명
			2. import 패키지명
		 */
		Dog aDog = new Dog(); // KJ1.Dog aDog = new KJ1.Dog();
		aDog.name = "happy";
		// aDog.IDN = "8933354"; Error! IDN is a private field;
		// aDog.nickname = "kk"; Error! nickname is a package field;
		
		Animal aa = new Animal();
		// aa.protectedField = "ddd"; Error! protected field는 다른 패키지에서는 private
		
		Rosemary rr = new Rosemary();
		// rr.publicField; Error! 외부 package에는 public만 접근 가능
		
	}

}
