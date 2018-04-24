package KJ1;

public class Dog extends Animal {

	public String name;
	private String IDN;
	String nickname; // package 접근 지정: package 내에서만 public
	
	void print() {
		
		System.out.println(publicField);
		// System.out.println(privateField); Error!
		System.out.println(packageField);
		System.out.println(protectedField);
		
	}
	
}