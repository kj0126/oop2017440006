public class Car {

	// Fields
	private String color;
	private int speed;
	public static int numberOfCars = 0; // ���� ����(static field)
	
	/*
		Constructor(������): �޼ҵ� ���� Ŭ���� �̸��� ����. ��ȯ���� ����. 
		�����ڸ� �������� ������, �Ű� ���� ���� ������ �����ڸ� �ڵ����� ������ش�. 
	 	������, �����ڸ� �ϳ� �� �����ϸ� �ڹٴ�  ������ �����ڸ� ������ �ʴ´�. 
	*/
	public Car() {
	
		this.color = "White";
		this.speed = 60;
		numberOfCars++;
		
	}
	
	public Car(String color, int speed) {
		
		this.color = color;
		this.speed = speed;
		numberOfCars++;
		
	}
	
	// Methods
	
	// ���� �޼ҵ�� ���� ������ ������ �� �ִ�. ����, this�� ������� ���Ѵ�. 
	public static void print() {
		
		// System.out.println(this.color + ", " + this.speed); // Error!
		System.out.println(numberOfCars);
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		
		return ("color is " + this.color + ", speed is " + this.speed);

	}
	
}