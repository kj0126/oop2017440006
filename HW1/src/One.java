import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// 1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
			
		int a, b;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("������ �Է��ϼ���: ");
		b = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if(a > b)
			System.out.println(a + "��(��) " + b + " �� " + a + "��(��) �� Ů�ϴ�. ");
		else
			System.out.println(a + "��(��) " + b + " �� " + b + "��(��) �� Ů�ϴ�. ");
	}

}
