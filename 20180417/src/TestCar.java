public class TestCar {

	public static void main(String[] args) {
		
		// ���� �޼ҵ�(static method): ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		System.out.println(Math.cos(0));
		
		Car.print();
		
		Car myCar = new Car("Space Blue", 300);
		System.out.println(myCar.numberOfCars);
		
		Car yourCar = new Car();
		/* 
			myCar.setColor("Space Blue");
			myCar.setSpeed(300);
		 */
		
		// ���� ������ Ŭ������.�������������ε� ������ �� �ִ�. 
		System.out.println(Car.numberOfCars);
		
		System.out.println(myCar);
		
	}
}