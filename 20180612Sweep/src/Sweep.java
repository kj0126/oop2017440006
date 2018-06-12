import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		
		Set<String> strs;
		// strs = new HashSet<>(); // �ؽ��Լ� ������ ���ĵǾ� ����. ��, ������ �� �� ����
		// strs = new TreeSet<>(); // ���ĺ� ������ ���ĵǾ� ����. 
		strs = new LinkedHashSet<>(); // �Է� ������ ���ĵǾ� ����. 
		
		// �������� �޼ҵ� add(), remove(), sweep ...
		strs.add("Trump");
		strs.add("Jungeun");
		strs.add("Jaein");
		strs.add("Joonpyo");
		
		// ù��° �a�� ���: Iterator ���
		Iterator<String> e = strs.iterator();
		while (e.hasNext()) { // ������ �a��. 
			
			String str = e.next(); // �ϳ��� ������. 
			System.out.println(str);
			
		}
		
		// �ι�° �a�� ���: for() �ݺ��� ���
		for (String str1: strs) {// for (���Ÿ�� ��������: �÷��Ǻ���)
			
			System.out.println(str1);
			
		}

	}

}