import java.util.Scanner;

public class Twentyone {

	public static void main(String[] args) {
		// 21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.

		int a, i, j, sum = 0;
		Scanner input = new Scanner(System.in);
				
		System.out.print("2 이상의 정수를 입력하세요: ");
		a = input.nextInt(); // 키보드에서 숫자 입력

		for(i = 2; i <= a; i++) {
			for(j = 2; j < i; j++)
				if((i % j) == 0)
					break;
			
			if(j == i)
				sum += i;
		}
		
		System.out.println(a + " 이하의 소수들의 합: " + sum);
	}

}
