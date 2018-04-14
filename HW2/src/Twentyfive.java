public class Twentyfive {

	public static void main(String[] args) {
		/*
			25.다음과 같은 출력이 나오도록 프로그램을 작성하시오.
			(1)			(2)
			***********	54321012345
			*********	432101234
			*******		3210123
			*****		21012
			***			101
			*			0
			***			101 
			*****		21012 
			*******		3210123 
			*********	432101234 
			***********	54321012345
		 */
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= (13 - 2 * i); j++)
				System.out.print('*');
			
			System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (1 + 2 * i); j++)
					System.out.print('*');
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5; i >= 0; i--) {
			for(int j = i; j >= 0; j--)
				System.out.print(j);
			
			for(int j = 1; j <= i; j++)
				System.out.print(j);
					
			System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j >= 0; j--)
				System.out.print(j);
			
			for(int j = 1; j <= i; j++)
				System.out.print(j);
					
			System.out.println();
		}
	}

}
