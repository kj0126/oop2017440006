import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		/* 
			11. 위의 문제(소수(prime-number) 검사와 흡사하게
			사용자가 입력한 수의 인수들을 모두 출력하는 프로그램을 작성하시오.)를
			0을 입력하기 전까지는 계속 수행(인수 출력)하도록 수정하시오.
		 */
		
		int a;
		Scanner input = new Scanner(System.in);
				
		while(true) {
			System.out.print("2 이상의 정수를 입력하세요: ");
			a = input.nextInt(); // 키보드에서 숫자 입력
				
			if(a == 0)
				break;
			
			System.out.print(a + " => ");
			for(int i = 2; i < a; i++)
				if((a % i) == 0)
					System.out.print(i + " ");
			System.out.println();
		}
	}

}
