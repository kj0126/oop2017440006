import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int score, good = 0, bad = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		score = input.nextInt(); // Ű���忡�� ���� �Է�
		
		System.out.println("������ " + score + "���Դϴ�. ");
		
		// ������ 60�� �̻��̸� "�հ��Դϴ�. ", 60�� �̸��̸� "���հ��Դϴ�. "
		// ��(>=): ���迬����
		// if(���ǽ�) {���� ��� ����} else {������ ��� ����} 
		if(score >= 60) {
			System.out.println("�հ��Դϴ�. ");
			good++;
		} // ���չ�(Compound Statement): ���� ������ �߰�ȣ{}�� ���� �ϳ��� �������� ó��
		else {
			System.out.println("���հ��Դϴ�. ");
			bad++;
		}
		
		// ������ 80�� �̻��̸�  A, 60�� �̻��̸� B, 60�� �̸��̸� F
		if(score >= 80)
			System.out.println("������ A�Դϴ�. ");
		else if(score >= 60)
			System.out.println("������ B�Դϴ�. ");
		else
			System.out.println("������ F�Դϴ�. ");
		
		// 0�� "����", 1�� "�ϳ�", 2�� "��", �� �ܴ̿� "����"
		switch (score)
		{
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		default:
			System.out.println("����");
		}
		
		System.out.println("���α׷� ����");
	}

}