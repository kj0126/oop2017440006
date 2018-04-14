import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		/*
			13. month와 day를 입력 받아, 1월 1일부터의 총 day수를 출력하는 프로그램을 작성하시오.(switch문 사용)
			1월 20일은 20일 출력, 2월 5일은 36일 출력. 단 2월은 28일로 계산.
		 */

		int month, day, total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		month = input.nextInt(); // 키보드에서 숫자 입력
		System.out.print("일을 입력하세요: ");
		day = input.nextInt(); // 키보드에서 숫자 입력
		
		switch(month) {
		case 12:
			total += 30; // 11월의 총 일수를 더한다. 
		case 11:
			total += 31; // 10월의 총 일수를 더한다. 
		case 10:
			total += 30; // 9월의 총 일수를 더한다. 
		case 9:
			total += 31; // 8월의 총 일수를 더한다. 
		case 8:
			total += 31; // 7월의 총 일수를 더한다. 
		case 7:
			total += 30; // 6월의 총 일수를 더한다. 
		case 6:
			total += 31; // 5월의 총 일수를 더한다. 
		case 5:
			total += 30; // 4월의 총 일수를 더한다. 
		case 4:
			total += 31; // 3월의 총 일수를 더한다. 
		case 3:
			total += 28; // 2월의 총 일수를 더한다. 
		case 2:
			total += 31; // 1월의 총 일수를 더한다. 
		default:
			total += day; // 일수를 더한다. 
		}
		
		System.out.println("1월 1일부터 " + month + "월 " + day + "일까지의 총 일수: " + total);
	}

}
