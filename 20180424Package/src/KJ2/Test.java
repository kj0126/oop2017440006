package KJ2;

import KJ1.*;

public class Test {

	public static void main(String[] args) {
		
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
		// aBasil.age = 2; Error! age is a private field;
		
		/*
			�ٸ� ��Ű���� Ŭ�󽺸� ����Ϸ���
			1. ��Ű����.Ŭ������
			2. import ��Ű����
		 */
		Dog aDog = new Dog(); // KJ1.Dog aDog = new KJ1.Dog();
		aDog.name = "happy";
		// aDog.IDN = "8933354"; Error! IDN is a private field;
		// aDog.nickname = "kk"; Error! nickname is a package field;
		
		Animal aa = new Animal();
		// aa.protectedField = "ddd"; Error! protected field�� �ٸ� ��Ű�������� private
		
		Rosemary rr = new Rosemary();
		// rr.publicField; Error! �ܺ� package���� public�� ���� ����
		
	}

}
