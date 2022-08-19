package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 선생님 풀이
		
		while(true) {
		try {
			// 'a b'가 입력되었을 때
			// next(): 공백 또는 엔터 - a
			// nextLine(): 엔터만 - a b
			System.out.print("어떤 수를 나누시겠습니까?>>");
			int dividend = scanner.nextInt();
			

			System.out.print("어떤 수로 나누시겠습니까?>>");
			int divisor = scanner.nextInt();

			int result = dividend / divisor;
			System.out.printf("%d / %d = %d", dividend, divisor, result);
		
			break;
			
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			
//			scanner.next();
			
	}
	}
		scanner.close();
	}
	
}

//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//			try {
//				System.out.print("어떤 수로 나누시겠습니까?>>");
//				String data1 = scanner.nextLine();
//				int value1 = Integer.parseInt(data1);
//
//				System.out.print("어떤 수를 나누시겠습니까?>>");
//				String data2 = scanner.nextLine();
//				int value2 = Integer.parseInt(data2);
//
//				int result = value1 / value2;
//				System.out.printf("%d / %d = %d\n", value1, value2, result);
//				break;
//
//			} catch (NumberFormatException e) { // 드래그 + alt shift z
////			e.printStackTrace();
//				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//			} catch (ArithmeticException e) { // 드래그 + alt shift z
////			e.printStackTrace();
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			}
//
//		}
//		scanner.close();
//
//	}
//}