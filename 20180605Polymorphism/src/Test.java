public class Test {

	public static void main(String[] args) {
		
		Animal aDog = new Dog("Tina"); // upcasting
		Animal aCat = new Cat("����"); // upcasting
		
		aDog.sing();
		// aDog.playFetch(); // Error!
		((Dog)aDog).playFetch(); // downcasting
		aDog = new Cat("����");
		// ((Dog)aDog).playFetch(); // Run Time Error!
		
		aCat.sing();
		// aCat.playFetch(); //  Error!
		// ((Dog)aCat).playFetch(); // Run Time Error!
		aCat = new Dog("Happy");
		((Dog)aCat).playFetch();
		
	}

}