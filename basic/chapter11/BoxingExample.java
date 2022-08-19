package chapter11;

public class BoxingExample {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Integer sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum += i;
		}
		
		long endTime = System.nanoTime();
		System.out.println("객체 사용: " + sum);
		System.out.println("객체 사용: " + (endTime - startTime));

		long startTime2 = System.nanoTime();
		int sum2 = 0;
		for (int i = 1; i <= 10000; i++) {
			sum2 += i;
		}
		
		long endTime2 = System.nanoTime();
		System.out.println("기본타입 사용: " + sum2);
		System.out.println("기본타입 사용: " + (endTime2 - startTime2));
	}
}

////		Integer i = new integer(100);
//		Integer i = 100; // autoboxing
//		int i2 = i; // auto unboxing