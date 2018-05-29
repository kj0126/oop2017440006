import java.util.*;

public class TestList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // upcasting
		// ArrayList<String> list = new ArrayList<String>();
		// List<String> list1 = new LinkedList<String>();
		
		list.add(0, "zero");
		list.add("one");
		list.add("two");
		list.add(1, "µ¹");
		
		System.out.println(list);
		
	}

}
