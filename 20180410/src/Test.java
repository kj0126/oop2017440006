public class Test {

	public static void main(String[] args) {
		
		Point pnt1 = new Point();

		pnt1.setX(1.0);
		pnt1.setY(1.0);
		
		Point pnt2 = new Point();
		
		pnt2.setX(2.0);
		pnt2.setY(2.0);
				
		System.out.println(pnt1); // System.out.println(pnt1.toString());
		// println() �޼ҵ��� �Ű� ������ ��ü�̸� ��ü�� toString() �޼ҵ带 ȣ���Ѵ�. 
		
		System.out.println(pnt2.distance());
		System.out.println(pnt2.distance(pnt1)); 
		// overloading method: �޼ҵ��� �̸��� ������ �Ű� ������ �ڷ����� �ٸ���. 
		
	}

}