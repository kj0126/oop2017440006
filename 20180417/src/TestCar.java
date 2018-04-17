public class TestCar {

	public static void main(String[] args) {
		
		// 정적 메소드(static method): 객체를 생성하지 않고 사용할 수 있는 메소드
		System.out.println(Math.cos(0));
		
		Car.print();
		
		Car myCar = new Car("Space Blue", 300);
		System.out.println(myCar.numberOfCars);
		
		Car yourCar = new Car();
		/* 
			myCar.setColor("Space Blue");
			myCar.setSpeed(300);
		 */
		
		// 정적 변수는 클래스명.정적변수명으로도 접근할 수 있다. 
		System.out.println(Car.numberOfCars);
		
		System.out.println(myCar);
		
	}
}