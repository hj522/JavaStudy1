package Exercise;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1 = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		int value1 = ((num1 + num2) + (Math.abs(num1 - num2))) / 2;
		int value2 = ((num1 + num2) - (Math.abs(num1 - num2))) / 2;
		
		scanner.close();
		
		
		System.out.print("큰 수를 작은 수로 나눈 몫은 " + value1 / value2 + "이고, 나머지는 " + value1 % value2 + "이다.");
}
}

/*
 * 0을 입력하지 않고 코드 짜기
 * 절대값을 반환하는 메소드 = Math.abs(숫자) 사용
 */