package chapter03;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double value1 = scanner.nextDouble();
		
		System.out.print("두 번째 수: ");
		double value2 = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("--------------");
		
		double value3 = value1 / value2;

		if(value2 == 0) {		
		System.out.println("결과:무한대");	
		}
		else {
		System.out.print("결과: " + value3);
		}
	}
}

/*
 * 첫 번째 수에 두 번째 수를 나눈 결과를 "결과:값" 으로 출력
 * 두 번째 수에 0 또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록 작성
 * 
 * double num3 = num1/num2;
 * String num5 = String.valueOf(num3);
 * String num4 = (num2==0||num2==0.0) ? "무한대" : num5;
 * System.out.println("결과:" + num4);
 */
