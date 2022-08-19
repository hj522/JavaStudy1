package Exercise;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int length1 = scanner.nextInt();
		
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int length2 = scanner.nextInt();

		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int length3 = scanner.nextInt();
		
		
		if ((length1 + length2) < length3 || (length2 + length3) < length1 || (length3 + length1) < length2) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
		  else
			System.out.println("삼각형을 만들 수 없습니다.");

		scanner.close();
	}
}

/*
 * 가장 긴 변의 길이가
 * 다른 두 변의 길이의 합보다 작으면
 * 삼각형을 만들 수 있다.
 */
