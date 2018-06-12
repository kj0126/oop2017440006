import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		// Map<String, String> map = new HashMap<>();
		// Map<String, String> map = new TreeMap<>(); // 키의 알파벳 순으로 저장
		Map<String, String> map = new LinkedHashMap<>(); // 키의 입력 순으로 저장
		
		// 추가: .put(key, value);
		// value 찾기: value = .get(key);
		
		map.put("제이니", "청와대");
		map.put("트럼트", "벡악관");
		map.put("정으니", "피양");
		
		System.out.println(map.get("제이니"));
		
		// 훍는 방법1: Iterator 사용
		// Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet(); // map에 저장된 엔트리(키, 값) 중 키만 모아서 만든  Set
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			
			String key = itr.next();
			System.out.println(String.format("키: %s, 값: %s", key, map.get(key)));
			
		}
		
		// 훍는 방법2: 키셋을 만들어  for() 반복문 사용
		for (String key: map.keySet()) {
			
			System.out.println(String.format("키: %s, 값: %s", key, map.get(key)));
		}
		
		// 훍는 방법3: 
		for (Map.Entry<String, String> elem: map.entrySet()) {
			
			System.out.println(String.format("키: %s, 값: %s", elem.getKey(), elem.getValue()));
			
		}
		
	}

}