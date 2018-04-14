import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		/*
			5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
			choose one of the following.
			apple
			orange
			banana
			peach

			enter your choice here : (사용자 입력)orange

			--------------
			Your choice is “orange”.
		 */
		
		String s;
		Scanner input = new Scanner(System.in);
		
		System.out.println("choose one of the following.");
		System.out.println("apple");
		System.out.println("orange");
		System.out.println("banana");
		System.out.println("peach");
		System.out.println();
		System.out.print("enter your choice here: ");
		s = input.nextLine();
		
		System.out.println();
		System.out.println("--------------");
		switch(s) {
		case "apple":
			System.out.println("Your choice is \"apple\".");
			break;
		case "orange":
			System.out.println("Your choice is \"orange\".");
			break;
		case "banana":
			System.out.println("Your choice is \"banana\".");
			break;
		case "peach":
			System.out.println("Your choice is \"peach\".");
			break;
		default:
			System.out.println("ERROR!!!");
			break;
		}
		
	}

}
