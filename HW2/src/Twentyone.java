import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		// 21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

		int a, i, j, sum = 0;
		Scanner input = new Scanner(System.in);
				
		System.out.print("2 �̻��� ������ �Է��ϼ���: ");
		a = input.nextInt(); // Ű���忡�� ���� �Է�

		for(i = 2; i <= a; i++) {
			for(j = 2; j < i; j++)
				if((i % j) == 0)
					break;
			
			if(j == i)
				sum += i;
		}
		
		System.out.println(a + " ������ �Ҽ����� ��: " + sum);
	}

}
