import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		/*
			6. � �� �ڸ� ���� �ڸ����� ������ ���� �ٲٴ� ���α׷��� �ۼ��Ͻÿ�.
			����� �Է� : �� ���� �� �ڸ� ����
			��� : �ڸ����� ������ �ݴ�� �� ����
		 */
		
		int a;
		Scanner input = new Scanner(System.in);

		System.out.print("�� �ڸ� ������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if((a >= 10) && (a <= 99))
			System.out.print("�� �ڸ� ���� " + a + "���� �ڸ����� ������ �ݴ�� �� ����: " + (a % 10) + (a / 10));
		else
			System.out.println("ERROR!!!");
	}

}
