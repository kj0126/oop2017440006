public class Loop {

	public static void main(String[] args) {
		
		// 1~10 정수를 출력
		int i; // i는 루프 변수
		
		i = 1; // 1. 루프 변수 초기화
		
		while(i <= 10) { // 2. 루프 조건식
			System.out.println(i); // 3. 루프문
			i++; // 4. 루프 변수 변화
		}
		
		// 위의 while 문을 for 문으로 변환
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}	
		
		// 1~10 정수의 합을 출력
		
		int sum = 0;
		
		i = 1; // 1. 루프 변수 초기화
		
		while(i <= 10) { // 2. 루프 조건식
			sum += i; // 3. 루프문
			i++; // 4. 루프 변수 변화
		}
		
		System.out.println("1~10 정수의 합은 " + sum);
		
		String str = "hello darkness my old friend";
		int count = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		
		System.out.println("문장에서 발견한 l의 개수는 " + count);
		
		System.out.println("프로그램 종료");
	}
	
}