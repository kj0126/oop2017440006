package KJ;

public class Dog extends Animal{

	
	public Dog() { // ����Ʈ ������	
		// ������ ���� Ŭ������ ����Ʈ ������ ȣ�� super();
		System.out.println("Dog ����Ʈ ������");
	
	}
	
	public Dog(int a) { // ������	
		// ������ ���� Ŭ������ ����Ʈ ������ ȣ�� super();
		super(a); // ����� ���� Ŭ������ ������ ������ ȣ��
		System.out.println("Dog ������ ������");
	
	}
	
}