import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		/*
			13. month�� day�� �Է� �޾�, 1�� 1�Ϻ����� �� day���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(switch�� ���)
			1�� 20���� 20�� ���, 2�� 5���� 36�� ���. �� 2���� 28�Ϸ� ���.
		 */

		int month, day, total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���: ");
		month = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("���� �Է��ϼ���: ");
		day = input.nextInt(); // Ű���忡�� ���� �Է�
		
		switch(month) {
		case 12:
			total += 30; // 11���� �� �ϼ��� ���Ѵ�. 
		case 11:
			total += 31; // 10���� �� �ϼ��� ���Ѵ�. 
		case 10:
			total += 30; // 9���� �� �ϼ��� ���Ѵ�. 
		case 9:
			total += 31; // 8���� �� �ϼ��� ���Ѵ�. 
		case 8:
			total += 31; // 7���� �� �ϼ��� ���Ѵ�. 
		case 7:
			total += 30; // 6���� �� �ϼ��� ���Ѵ�. 
		case 6:
			total += 31; // 5���� �� �ϼ��� ���Ѵ�. 
		case 5:
			total += 30; // 4���� �� �ϼ��� ���Ѵ�. 
		case 4:
			total += 31; // 3���� �� �ϼ��� ���Ѵ�. 
		case 3:
			total += 28; // 2���� �� �ϼ��� ���Ѵ�. 
		case 2:
			total += 31; // 1���� �� �ϼ��� ���Ѵ�. 
		default:
			total += day; // �ϼ��� ���Ѵ�. 
		}
		
		System.out.println("1�� 1�Ϻ��� " + month + "�� " + day + "�ϱ����� �� �ϼ�: " + total);
	}

}
