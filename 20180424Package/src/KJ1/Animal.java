package KJ1;

public class Animal {

	public String publicField;
	private String privateField;
	String packageField;
	/*
		protected: ��Ű�� ���ο� ������� ��� ����
		���� ��Ű�������� public, 
		�ٸ� ��Ű�������� ����� �ǳ� private
	 */
	protected String protectedField;
	
	public Animal() {
		
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
		
	}
	
}
