public class Loop {

	public static void main(String[] args) {
		
		// 1~10 ������ ���
		int i; // i�� ���� ����
		
		i = 1; // 1. ���� ���� �ʱ�ȭ
		
		while(i <= 10) { // 2. ���� ���ǽ�
			System.out.println(i); // 3. ������
			i++; // 4. ���� ���� ��ȭ
		}
		
		// ���� while ���� for ������ ��ȯ
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}	
		
		// 1~10 ������ ���� ���
		
		int sum = 0;
		
		i = 1; // 1. ���� ���� �ʱ�ȭ
		
		while(i <= 10) { // 2. ���� ���ǽ�
			sum += i; // 3. ������
			i++; // 4. ���� ���� ��ȭ
		}
		
		System.out.println("1~10 ������ ���� " + sum);
		
		String str = "hello darkness my old friend";
		int count = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		
		System.out.println("���忡�� �߰��� l�� ������ " + count);
		
		System.out.println("���α׷� ����");
	}
	
}