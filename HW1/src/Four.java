import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		
		int a = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if((a <= 100) && (a >= 80))
			System.out.println("���: A");
		else if((a < 80) && (a >= 60))
			System.out.println("���: B");
		else if((a < 60) && (a >= 40))
			System.out.println("���: C");
		else if((a < 40) && (a >= 20))
			System.out.println("���: D");
		else
			System.out.println("���: E");
	}

}