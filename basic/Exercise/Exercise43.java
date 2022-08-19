package Exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. \n프로그래밍 기초: ");
		double exam1 = scanner.nextDouble();
		
		System.out.print("데이터베이스: ");
		double exam2 = scanner.nextDouble();
		
		System.out.print("화면 구현: ");
		double exam3 = scanner.nextDouble();
		
		System.out.print("애플리케이션 구현: ");
		double exam4 = scanner.nextDouble();
		
		System.out.print("머신러닝: ");
		double exam5 = scanner.nextDouble();
		
		double sum = exam1 + exam2 + exam3 + exam4 + exam5;
		System.out.printf("총점: %d\n", (int)sum);  // 91p 형식 문자열 사용
		
		double average = (double)(sum/5);
		System.out.printf("평균: %-10.2f\n", average); // 91p 형식 문자열 사용
		
		if(average >= 90) {
			System.out.println("학점: A");
		} else if((average >= 80) && (average < 90)) {
			System.out.println("학점: B");
		} else if((average >= 70) && (average < 80)) {
			System.out.println("학점: C");	
		} else if((average >= 60) && (average < 70)) {
			System.out.println("학점: D");
		} else
		System.out.println("학점: F");
		
		scanner.close();
	}
}

/*  90점 이상 A
	80점 이상 90점 미만 B
	70점 이상 80점 미만 C
	60점 이상 70점 미만 D
	60점 미만 F
*/