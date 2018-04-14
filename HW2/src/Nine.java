import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		/* 
			9. 위의 문제( 1부터 9사이의 숫자 하나를 입력 받아 그 숫자의 구구단을 출력하는 프로그램을 작성하시오.)에서 
			1부터 9사이 이외의 숫자를 사용자가 잘못 입력할 수도 있으니,
			이 경우에 잘못된 숫자라는 것을 알려주는 에러 메시지를 출력하고 다시 숫자를 입력 받도록 처리하시오.
			(입력의 유효성 검사)
		*/
		
		int a;
		Scanner input = new Scanner(System.in);
				
		System.out.print("1부터 9사이의 정수를 입력하세요: ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		
		while((a < 1) || (a > 9)) {
			System.out.println("ERROR! 잘못된 숫자입니다. ");
			System.out.print("다시 입력하세요: ");
			a = input.nextInt(); // 키보드에서 숫자 입력
		}
					
		for(int i = 1; i <= 9; i++)
			System.out.println(a + " * " + i + " = " + (a * i));		
	}

}