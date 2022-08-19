package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "ȫ�浿"), 90);
		map.put(new Student(2, "�̼���"), 87);
		map.put(new Student(3, "�ſ��"), 100);
		map.put(new Student(4, "���ο�"), 63);
		map.put(new Student(3, "�ſ��"), 94); // Ű���� �ߺ��Ǹ� �����
		map.put(new Student(5, "�ſ��"), 94);	
		
		System.out.println("�� ����: " + map.size());
		
		System.out.println("�ſ�� ����: " + map.get(new Student(5, "�ſ��")));
		
		map.remove(new Student(5, "�ſ��"));
		
		System.out.println("�� ����: " + map.size());
		
		// ��ü�� �ϳ��� ó��(��Ʈ���� ���)
		Set<Entry<Student,Integer>> entrySet = map.entrySet(); //�ߺ��ɼ�������
		
		for(Entry<Student, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println();
		
		// 2. key�� �̿�
		Set<Student> keySet = map.keySet();
		for (Student student : keySet) {
			System.out.println(student + ":" + map.get(student));
		}
		
		// 3. value�� �̿�: value�� �����´�.
		Collection<Integer> values = map.values();
		for (Integer integer : values) {
			System.out.println(integer);
		}
		
		// ��ü ����� - ��� ������ ����
		map.clear(); 
		
	}
}
