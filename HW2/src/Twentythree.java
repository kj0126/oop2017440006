public class Twentythree {

	public static void main(String[] args) {
		/*
			23.
			***** *
			*** ***
			* *****
			�� ����Ͻÿ�(�ݺ��� �Ἥ!)
		 */
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 7; j++)
				if(j == (8 - 2 * i))
					System.out.print(' ');
				else
					System.out.print('*');
			
			System.out.println();
		}
	}

}
