package chapter10;

public class TryCatchFinallyExample {
	public static void main(String[] args) throws ClassNotFoundException {

		// 1. try catch
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.err.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
		// 2. throws exception
		Class.forName("java.lang.String2");
	}
}