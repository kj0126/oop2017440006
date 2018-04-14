import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.

		int a, i;
		Scanner input = new Scanner(System.in);
				
		System.out.print("2 이상의 정수를 입력하세요: ");
		a = input.nextInt(); // 키보드에서 숫자 입력

		for(i = 2; i < a; i++)
			if((a % i) == 0)
				break;
		
		if(i == a)
			System.out.println(a + "은(는) 소수입니다. ");
		else
			System.out.println(a + "은(는) 소수가 아닙니다. ");
	}

}
