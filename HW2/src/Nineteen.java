import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int a, i;
		Scanner input = new Scanner(System.in);
				
		System.out.print("2 �̻��� ������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�

		for(i = 2; i < a; i++)
			if((a % i) == 0)
				break;
		
		if(i == a)
			System.out.println(a + "��(��) �Ҽ��Դϴ�. ");
		else
			System.out.println(a + "��(��) �Ҽ��� �ƴմϴ�. ");
	}

}
