import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		/* 
			11. ���� ����(�Ҽ�(prime-number) �˻�� ����ϰ�
			����ڰ� �Է��� ���� �μ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.)��
			0�� �Է��ϱ� �������� ��� ����(�μ� ���)�ϵ��� �����Ͻÿ�.
		 */
		
		int a;
		Scanner input = new Scanner(System.in);
				
		while(true) {
			System.out.print("2 �̻��� ������ �Է��ϼ���: ");
			a = input.nextInt(); // Ű���忡�� ���� �Է�
				
			if(a == 0)
				break;
			
			System.out.print(a + " => ");
			for(int i = 2; i < a; i++)
				if((a % i) == 0)
					System.out.print(i + " ");
			System.out.println();
		}
	}

}
