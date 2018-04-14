public class TestString {

	public static void main(String[] args) {
		
		int a = 10; // int 형의 변수 a 생성, 값 10을 a에 저장, a는 원시 변수
		
		// string 객체 생성 방법
		String str; // class String의 객체를 참조할 수 있는 참조 변수(레퍼런스 변수) 생성, String은 클래스 이름, str은 참조 변수(레퍼런스 변수)
		str = new String("Hello Darkness my old friend."); // 객체 생성
		
		// String 객체의 길이
		// 메소드 호출 방법: 참조 변수.메소드()
		int len = str.length();
		System.out.println("string legth is " + len);
				
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: " + str1);

	}

}