import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		/*
			15. 1~100 ������ ���� �ϳ��� ���� ��(�������� �����ص� ��), 10�� �̳��� �� ���ڸ� ���ߴ� ������ �ۼ��Ͻÿ�.
			(10�� �̳��� �� ���߾��� ���� �ణ �Ӹ��� ������ ����̹Ƿ� Game Over ó���� �Ŷ��ϰ� �� �ֱ� �ٶ�)

			��) ���� 49�� ���:

			���ڸ� �Է��Ͻÿ�: 36
			�Է��Ͻ� ���ں��� Ů�ϴ�.

			���ڸ� �Է��Ͻÿ�: 51
			�Է��Ͻ� ���ں��� �۽��ϴ�.

			���ڸ� �Է��Ͻÿ�: 49
			�����Դϴ�!
		 */

		int a, answer = 20, count = 0;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			a = input.nextInt(); // Ű���忡�� ���� �Է�
			
			if(answer > a)
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�. ");
			else if(answer < a)
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�. ");
			else {
				System.out.println("�����Դϴ�!");
				break;
			}
			
			count++;
			System.out.println();
			
			if(count >= 10) {
				System.out.println("Game Over!!!");
				break;
			}
		}
	}

}
