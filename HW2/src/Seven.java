import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
	
		int a, sum = 0;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("������ �Է��ϼ���: ");
			a = input.nextInt(); // Ű���忡�� ���� �Է�
			
			if(a == 0)
				break;
		
			sum += a;
		}
		
		System.out.println("�Է��� ������ �� : " + sum);
	}

}