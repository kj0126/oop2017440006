import java.util.*;

public class AnimalSing {

	List<Animal> list; // Animal�� �װ��� �ڽ� ��ü�� ���� �� �ִ�. 
	
	AnimalSing() {
		
		list = new ArrayList<Animal>();
		
	}
	
	// ����ȯ�� �ϴ� �ñ����� ������ �޼ҵ��� �Ű������� ��� 
	// 
	void add(Animal ele) {
		
		list.add(ele);
		
	}
	
	void sing() {
		
		Iterator<Animal> e = list.iterator();
		
		while(e.hasNext())
			e.next().sing(); // Polymorphism(������)
		
	}
	
}