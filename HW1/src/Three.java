import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오. 
		
		int a, b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		a = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("정수를 입력하세요: ");
		b = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("정수를 입력하세요: ");
		c = input.nextInt(); // 키보드에서 숫자 입력		
		
		System.out.print(a + ", " + b + ", " + c + " 중에서 가장 큰 수는 ");
		if(a > b)
			if(a > c)
				System.out.println(a + "입니다. ");
			else
				System.out.println(c + "입니다. ");
		else
			if(b > c)
				System.out.println(b + "입니다. ");
			else
				System.out.println(c + "입니다. ");
	}

}
