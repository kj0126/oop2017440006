import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 7. 0이 입력될 때까지 계속 정수를 입력 받고, 입력된 모든 숫자들의 총합을 출력하시오.
	
		int a, sum = 0;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요: ");
			a = input.nextInt(); // 키보드에서 숫자 입력
			
			if(a == 0)
				break;
		
			sum += a;
		}
		
		System.out.println("입력한 정수의 합 : " + sum);
	}

}