import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		/* 
			9. ���� ����( 1���� 9������ ���� �ϳ��� �Է� �޾� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.)���� 
			1���� 9���� �̿��� ���ڸ� ����ڰ� �߸� �Է��� ���� ������,
			�� ��쿡 �߸��� ���ڶ�� ���� �˷��ִ� ���� �޽����� ����ϰ� �ٽ� ���ڸ� �Է� �޵��� ó���Ͻÿ�.
			(�Է��� ��ȿ�� �˻�)
		*/
		
		int a;
		Scanner input = new Scanner(System.in);
				
		System.out.print("1���� 9������ ������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		while((a < 1) || (a > 9)) {
			System.out.println("ERROR! �߸��� �����Դϴ�. ");
			System.out.print("�ٽ� �Է��ϼ���: ");
			a = input.nextInt(); // Ű���忡�� ���� �Է�
		}
					
		for(int i = 1; i <= 9; i++)
			System.out.println(a + " * " + i + " = " + (a * i));		
	}

}