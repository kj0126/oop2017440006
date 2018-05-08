import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Animal aaa;
		
		Dog tina = new Dog();
		tina.sing();
		
		tina = new Dog();
		tina.eat();
		
		int a = (int)3.1; // ����ȯ(type casting)
		/*
			���� ����ȯ(upcasting)
			
			�캯�� Ŭ������ �º��� Ŭ������ subclass�̸� ������ �߻����� �ʴ´�. �º� <-- �캯 
			overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 ȣ���Ѵ�. 
		*/
		aaa = new Dog(); // aaa = (Animal) new Dog();
		aaa.sing();
		
		aaa = new Cat();
		aaa.sing();
		/*
			������(ploymorphism)
			
			1. ���� Subclass�� ���� ���
			2. ��� Subclass�� Superclass�� �޼ҵ带 override�Ѵ�. 
			3. Superclass refVer = new Subclass();
			4. refVer.overridingMethod()
			Subclass�� overriding method�� ȣ���Ѵ�. 
		 */
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if (str.equals("dog"))
			aaa = new Dog();
		else
			aaa = new Cat();
		aaa.sing(); // ���� ���ε�(dynamic binding): ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�. 
		
		// �߻� Ŭ������ ��ü�� ���� �� ����. 
		// aaa = new Animal(); Error!
		// aaa.sing(); Error!
		
	}

}