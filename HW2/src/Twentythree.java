public class Twentythree {

	public static void main(String[] args) {
		/*
			23.
			***** *
			*** ***
			* *****
			를 출력하시오(반복문 써서!)
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
