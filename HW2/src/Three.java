public class Three {

	public static void main(String[] args) {
		// 3. 1���� 100������ ����(����) �߿��� 3�� �����(3,6,9,12,..)���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(while�� ���)

		int i = 1, sum = 0;
		
		while(i <= 100)
		{
			if((i % 3) == 0)
				sum += i;
			
			i++;
		}
		
		System.out.println("sum: " + sum);
	}

}