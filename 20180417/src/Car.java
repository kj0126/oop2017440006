public class Car {

	// Fields
	private String color;
	private int speed;
	public static int numberOfCars = 0; // 정적 변수(static field)
	
	/*
		Constructor(생성자): 메소드 명이 클래스 이름과 같다. 반환형이 없다. 
		생성자를 정의하지 않으면, 매개 변수 없는 디폴드 생성자를 자동으로 만들어준다. 
	 	하지만, 생성자를 하나 라도 정의하면 자바는  디폴드 생성자를 만들지 않는다. 
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
	
	// 정적 메소드는 정적 변수만 접근할 수 있다. 따라서, this를 사용하지 못한다. 
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