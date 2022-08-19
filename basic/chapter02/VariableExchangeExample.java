package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3; // 선언
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);

		int temp; // x,y 수 위치를 바꾸기 위해 임시 변수부터 생성
		temp = x;
		x = y; // 위에서 선언했으므로 다시 int를 붙이지 않음
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
		
	}
}
