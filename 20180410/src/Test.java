public class Test {

	public static void main(String[] args) {
		
		Point pnt1 = new Point();

		pnt1.setX(1.0);
		pnt1.setY(1.0);
		
		Point pnt2 = new Point();
		
		pnt2.setX(2.0);
		pnt2.setY(2.0);
				
		System.out.println(pnt1); // System.out.println(pnt1.toString());
		// println() 메소드의 매개 변수가 객체이면 객체의 toString() 메소드를 호출한다. 
		
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt1)); 
		// overloading method: 메소드의 이름은 같지만 매개 변수의 자료형이 다르다. 
		
	}

}