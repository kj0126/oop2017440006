
public class Test {

	public static void main(String[] args) {
		
		Drivable d = new Car();
		d.brake();
		d.acc();
		
		d = new Bicycle();
		d.brake();
		d.acc();
		
	}

}
