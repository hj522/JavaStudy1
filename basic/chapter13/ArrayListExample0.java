package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample0 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // string °´Ã¼¸¦ ÀúÀå
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size(); // ÀúÀåµÈ ÃÑ °´Ã¼ ¼ö ¾ò±â
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		System.out.println();
	}
}
