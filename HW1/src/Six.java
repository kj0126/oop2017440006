import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		/*
			6. 어떤 두 자리 수의 자릿수의 순서를 서로 바꾸는 프로그램을 작성하시오.
			사용자 입력 : 한 개의 두 자리 정수
			출력 : 자릿수의 순서가 반대로 된 정수
		 */
		
		int a;
		Scanner input = new Scanner(System.in);

		System.out.print("두 자리 정수를 입력하세요: ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		if((a >= 10) && (a <= 99))
			System.out.print("두 자리 정수 " + a + "에서 자릿수의 순서가 반대로 된 정수: " + (a % 10) + (a / 10));
		else
			System.out.println("ERROR!!!");
	}

}
