package chapter12;

public class GenericExample {
	public static void main(String[] args) {

		/* 
		 * Generic(제네릭)
		 * JDK 1.5부터 도입
		 * 표현 방법: <> 를 이용
		 */
//		
//		IntValue value = new IntValue(10);
//		System.out.println(value.getValue());
//		StringValue value2 = new StringValue("10");
//		System.out.println(value2.getValue());
//		
//		Value value3 = new Value("a");
//		int value4 = (int) value3.getValue();
//		
//		Value value5 = new Value(100);
//		String value6 = (String) value5.getValue();
//		
		
		// generic 사용
		Box<Integer> box = new Box<Integer>(100);
		box.setValue(100);
		Integer value = box.getValue();  // int integer = box.getValue(); 도 가능
	}
}
