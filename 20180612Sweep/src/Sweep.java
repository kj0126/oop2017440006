import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		
		Set<String> strs;
		// strs = new HashSet<>(); // 해쉬함수 순으로 정렬되어 저장. 즉, 순서를 알 수 없음
		// strs = new TreeSet<>(); // 알파벳 순으로 정렬되어 저장. 
		strs = new LinkedHashSet<>(); // 입력 순으로 정렬되어 저장. 
		
		// 기존적인 메소드 add(), remove(), sweep ...
		strs.add("Trump");
		strs.add("Jungeun");
		strs.add("Jaein");
		strs.add("Joonpyo");
		
		// 첫번째 훍는 방법: Iterator 사용
		Iterator<String> e = strs.iterator();
		while (e.hasNext()) { // 끝까지 훍다. 
			
			String str = e.next(); // 하나씩 빼내다. 
			System.out.println(str);
			
		}
		
		// 두번째 훍는 방법: for() 반복문 사용
		for (String str1: strs) {// for (요소타입 참조변수: 컬렉션변수)
			
			System.out.println(str1);
			
		}

	}

}