import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
	// 2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int a;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if(a % 2 == 0)
			System.out.println(a + "��(��) ¦���Դϴ�. ");
		else
			System.out.println(a + "��(��) Ȧ���Դϴ�. ");
	}

}