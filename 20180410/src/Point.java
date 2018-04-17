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
		
		// ��ȯ�� ���� ����
		double result;// ���� ������ ��ȿ ������ �żҵ� ����
		
		// �Ÿ� ���
		result = Math.sqrt(x * x + y * y);
		
		// �Ÿ� ��ȯ
		return result; 
	}
	
	// overloading method 
	public double distance(Point p) {
		
		// ��ȯ�� ���� ����
		double result;// ���� ������ ��ȿ ������ �żҵ� ����
		
		// �Ÿ� ���
		result = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
		
		// �Ÿ� ��ȯ
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