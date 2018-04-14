import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		// (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		
		int a = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		if((a <= 100) && (a >= 80))
			System.out.println("등급: A");
		else if((a < 80) && (a >= 60))
			System.out.println("등급: B");
		else if((a < 60) && (a >= 40))
			System.out.println("등급: C");
		else if((a < 40) && (a >= 20))
			System.out.println("등급: D");
		else
			System.out.println("등급: E");
	}

}