package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
/*		1.
		ArrayList<String> list1 = new ArrayList<>(); // 초급자
		2.
		List<String> list = new ArrayList<>();
		3.
		List<String> list2 = Array.asList("Java", "JDBC", "Servlet/JSP");
*/		
		
		List<String> list = new ArrayList<>(); // 중급자
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		list.add(2, "Database");
		list.add("myBatis");

//		for (String string : list) {
//			System.out.println(string);
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		
		System.out.println();
		
		// get
		String skill = list.get(1);
		System.out.println(skill);

		// remove
		list.remove(0);
		
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		 }
		 
		 System.out.println();
		 
		 list.remove("myBatis");
		 
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
			
		 }
		 System.out.println();
		 
		 list.clear();
		 System.out.println(list.size());
	}
}
