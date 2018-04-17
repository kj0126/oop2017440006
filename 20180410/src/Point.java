public class Point {
	
	// Fields
	private double x;
	private double y;
	
	// Methods
	public void print() {
		
		// System.out.println("(" + getX() + ", " + getY() + ")");
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public String toString() {
		return ("(" + x + ", " + y + ")");
	}

	public double distance() {
		
		// 반환할 변수 선언
		double result;// 지역 변수의 유효 범위는 매소드 내부
		
		// 거리 계산
		result = Math.sqrt(x * x + y * y);
		
		// 거리 변환
		return result; 
	}
	
	// overloading method 
	public double distance(Point p) {
		
		// 반환할 변수 선언
		double result;// 지역 변수의 유효 범위는 매소드 내부
		
		// 거리 계산
		result = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
		
		// 거리 변환
		return result; 
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
}