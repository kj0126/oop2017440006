import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		
		// Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); // ���ĺ� ������ ����+
		
		strs.add("Trump");
		strs.add("Jungeun");
		strs.add("Jaein");
		strs.add("Joonpyo");
		
		while (!strs.isEmpty()) {
			
			System.out.println(strs.remove()); // ť �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ
			Thread.sleep(2000);
			
		}
		
	}

}