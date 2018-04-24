package KJ1;

public class Test {

	public static void main(String[] args) {
		
		Dog tina = new Dog();
		tina.print();
		
		tina.name = "Tina";
		// tina.IDN = "693821088"; Error! IDN is a private field;
		tina.nickname = "tt";
		tina.publicField = "U2";
		// tina.privateField = "String"; Error!
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";

	}

}