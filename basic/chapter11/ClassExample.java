package chapter11;

import java.lang.reflect.Field;

public class ClassExample {
	public static void main(String[] args) throws Exception {
		
		// Reflection
		
		//member��� Ŭ����(�ʵ�,�޼ҵ� ��� ����)�� ������
		Class class1 = Member.class;	
		
		Class class2 = Class.forName("chapter11.Member");
		
		Member member = new Member("a001", "������", 100);
		Class class3 = member.getClass();
		
//		Field[] fields = class3.getDeclaredFields();
//		for(Field field : fields) {
//			System.out.println(field.getName());
		}
	}
