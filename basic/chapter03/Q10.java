package chapter03;

public class Q10 {
	public static void main(String[] args) {
		int var1 = 10; // 반지름이 10인 원의 넓이 구하기
		int var2 = 3;
		int var3 = 14; 
		double value = (var3 * 0.01);
		double var4 = var1 * var1 * (var2 + value);
		System.out.println("원의 넓이:" + (int)var4);
	}
}


/*
 * 올바른 결과가 나오도록 코드를 수정하시오.
 * 원의 넓이 공식 = 반지름 * 반지름 * 원주율
 * 
 * double var4 = (var1 * var1) * Double.parseDouble(var2 + "." + var3); 문자를 실수로 변환
 */