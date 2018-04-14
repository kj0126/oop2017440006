public class RememberC {

	public static void main(String[] args) {
		
		// 변수: 값을 저장하기 위한  메모리 저장 공간(하나 또는 여러 개의 집합)의 이름
		
		/*
			자료형:
			
			1. 변수가 가질 수 있는 값의 범위를 정한다.
			2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다.
			3. 값을 메모리에 저장하기 위해 필요한 정보(저장 공간의 수, 저장 포맷)을 정한다.
		 */
		
		/*
			변수 선언:
			
			1. 사용할 변수의 이름을 지정한다
			2. 사용할 변수의 자료형을 선언한다.
			
			Java에서 변수를 사용하기 전에 반드시 변수선언을 해야 한다.
		 */
		
		int a, b; // 변수 선언문
		// a는 변수의 이름, 변수 a의 자료형은 int
		
		// 리터럴(literal): 소스 코드에서 특정한 자료형의 값을 직접 표현하는 방법
		
		// 연산자: 연산을 수행하는 기호
		
		// 대입 연산자(=): 우변의 값을 좌변의 저장소로 이동하고 우변의 값을 반환
		
		/*
			수식(expression): 
			
			연산자와 피연산자(리터럴, 변수, 수식)들의 조합. 
		 	모든 수식은 값을 반환(리턴)한다.
		 */
		
		// 부수 효과(side effect): 수식(또는 함수)이 값을 반환하는 것 외에  부수적으로 수행하는 것
		
		a = 0x10;
		a = (a * 10) + 20;
		
		// post increment(a++): 반환값은 a, 부수 효과는 a = a + 1
		b = a++;
		
		System.out.println("a = " + a + ", b = " + b);
		
		a = 10;
		// pre increment(++a): 반환값은 a + 1, 부수 효과는 a = a + 1
		b = ++a;
		
		System.out.println("a = " + a + ", b = " + b);
		
		// Java는 부울 자료형과 true/false 리터럴이 존재
		
		// 논리 연산자(&&, ||, !)의 피연산자는 부울 변수 또는 리터럴
		
		// 관계 연산자(>, <, <=, >=, ==, !=)는 부울 값을 반환
		
		boolean bb;
		bb = false || true;
		bb = 0 > 1;
		
		System.out.println("bb = " + bb);
		
		// Java에서 상수를 선언하려면 final 키워드를 사용해야 한다. 
		
		final int c = 100;
		// c = 1000; Error! c는 상수
		
		System.out.println("c = " + c);
		
		// 소숫점 자료형(float, double)
		
		float ff;
		double dd;
		ff = 3.14F;
		dd = 3.14; // 리터럴 3.14의 자료형은 double
		
		System.out.println("ff = " + ff + ", dd = " + dd);
		
		// 형변환(casting): 유사한 자료형으로 변환
		
		int x = 10;
		double y = 100.34;
		x = (int)y; // explicit casting
		// y = x; // implicit casting // y = (double)x;
		
		System.out.println("x = " + x + ", y = " + y);
	}

}