import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("������ �Է��ϼ���: ");
		b = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("������ �Է��ϼ���: ");
		c = input.nextInt(); // Ű���忡�� ���� �Է�		
		
		System.out.print(a + ", " + b + ", " + c + " �߿��� ���� ū ���� ");
		if(a > b)
			if(a > c)
				System.out.println(a + "�Դϴ�. ");
			else
				System.out.println(c + "�Դϴ�. ");
		else
			if(b > c)
				System.out.println(b + "�Դϴ�. ");
			else
				System.out.println(c + "�Դϴ�. ");
	}

}
