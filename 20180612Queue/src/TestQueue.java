import java.util.*;

public class TestQueue {

	public static void main(String[] args) throws InterruptedException {
		
		// Queue<String> strs = new LinkedList<>();
		Queue<String> strs = new PriorityQueue<>(); // 알파벳 순으로 저장+
		
		strs.add("Trump");
		strs.add("Jungeun");
		strs.add("Jaein");
		strs.add("Joonpyo");
		
		while (!strs.isEmpty()) {
			
			System.out.println(strs.remove()); // 큐 맨 앞에서 요소를 제거하여 그 요소를 반환
			Thread.sleep(2000);
			
		}
		
	}

}