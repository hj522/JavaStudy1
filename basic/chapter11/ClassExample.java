package chapter11;

import java.lang.reflect.Field;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		
		// Reflection
		
		//member라는 클래스(필드,메소드 등등 내용)를 가져옴
		Class class1 = Member.class;	
		
		Class class2 = Class.forName("chapter11.Member");
		
		Member member = new Member("a001", "김은대", 100);
		Class class3 = member.getClass();
		
//		Field[] fields = class3.getDeclaredFields();
//		for(Field field : fields) {
//			System.out.println(field.getName());
		}
	}
