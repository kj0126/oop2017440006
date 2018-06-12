import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		// Map<String, String> map = new HashMap<>();
		// Map<String, String> map = new TreeMap<>(); // Ű�� ���ĺ� ������ ����
		Map<String, String> map = new LinkedHashMap<>(); // Ű�� �Է� ������ ����
		
		// �߰�: .put(key, value);
		// value ã��: value = .get(key);
		
		map.put("���̴�", "û�ʹ�");
		map.put("Ʈ��Ʈ", "���ǰ�");
		map.put("������", "�Ǿ�");
		
		System.out.println(map.get("���̴�"));
		
		// �a�� ���1: Iterator ���
		// Iterator<String> itr = map.keySet().iterator();
		Set<String> set = map.keySet(); // map�� ����� ��Ʈ��(Ű, ��) �� Ű�� ��Ƽ� ����  Set
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			
			String key = itr.next();
			System.out.println(String.format("Ű: %s, ��: %s", key, map.get(key)));
			
		}
		
		// �a�� ���2: Ű���� �����  for() �ݺ��� ���
		for (String key: map.keySet()) {
			
			System.out.println(String.format("Ű: %s, ��: %s", key, map.get(key)));
		}
		
		// �a�� ���3: 
		for (Map.Entry<String, String> elem: map.entrySet()) {
			
			System.out.println(String.format("Ű: %s, ��: %s", elem.getKey(), elem.getValue()));
			
		}
		
	}

}