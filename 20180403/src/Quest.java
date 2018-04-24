public class Quest {
	
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1.equals(str2)); // true를 리턴
		System.out.println(str1 == str2); // false를 리턴
		str1 = str2;
		System.out.println(str1 == str2); // true를 리턴
	}
}