import java.util.*;

public class AnimalSing {

	List<Animal> list; // Animal과 그것의 자식 객체를 가질 수 있다. 
	
	AnimalSing() {
		
		list = new ArrayList<Animal>();
		
	}
	
	// 형변환을 하는 궁극적인 목적이 메소드의 매개변수를 모두 
	// 
	void add(Animal ele) {
		
		list.add(ele);
		
	}
	
	void sing() {
		
		Iterator<Animal> e = list.iterator();
		
		while(e.hasNext())
			e.next().sing(); // Polymorphism(다형성)
		
	}
	
}