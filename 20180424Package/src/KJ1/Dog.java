package KJ1;

public class Dog extends Animal {

	public String name;
	private String IDN;
	String nickname; // package ���� ����: package �������� public
	
	void print() {
		
		System.out.println(publicField);
		// System.out.println(privateField); Error!
		System.out.println(packageField);
		System.out.println(protectedField);
		
	}
	
}