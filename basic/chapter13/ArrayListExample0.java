package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample0 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // string ��ü�� ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // ����� �� ��ü �� ���
		System.out.println("�� ��ü��: " + size);
		System.out.println();
	}
}
