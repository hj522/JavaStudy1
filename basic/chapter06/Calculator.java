package chapter06;

public class Calculator {
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	} // return x + y; ���ٷε� ����
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	} // return (double)x / y;
	
	void powerOff() { 
		System.out.println("������ ���ϴ�.");
	}
}
