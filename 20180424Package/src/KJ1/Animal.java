package KJ1;

public class Animal {

	public String publicField;
	private String privateField;
	String packageField;
	/*
		protected: 패키지 여부와 상관없이 상속 가능
		동일 패키지에서는 public, 
		다른 패키지에서는 상속이 되나 private
	 */
	protected String protectedField;
	
	public Animal() {
		
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
		
	}
	
}
