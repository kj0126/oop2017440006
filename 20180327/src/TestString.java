public class TestString {

	public static void main(String[] args) {
		
		int a = 10; // int ���� ���� a ����, �� 10�� a�� ����, a�� ���� ����
		
		// string ��ü ���� ���
		String str; // class String�� ��ü�� ������ �� �ִ� ���� ����(���۷��� ����) ����, String�� Ŭ���� �̸�, str�� ���� ����(���۷��� ����)
		str = new String("Hello Darkness my old friend."); // ��ü ����
		
		// String ��ü�� ����
		// �޼ҵ� ȣ�� ���: ���� ����.�޼ҵ�()
		int len = str.length();
		System.out.println("string legth is " + len);
				
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: " + str1);

	}

}