
public class Test {

	public static void main(String[] args) {
		
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str);
		// int: primitive type, Integer: reference type
		Integer i = new Integer(3); // Integer i = 3;
		System.out.println(i);
		// i = 1 + box.get();
		
		System.out.println("the box contain " + box.get());
		
		int a = 10;
		box.set(a); // autoboxing
		System.out.println(10 + (Integer)box.get());
	}

}