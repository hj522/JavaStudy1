package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // ������ Ǯ��
		
		while(true) {
		try {
			// 'a b'�� �ԷµǾ��� ��
			// next(): ���� �Ǵ� ���� - a
			// nextLine(): ���͸� - a b
			System.out.print("� ���� �����ðڽ��ϱ�?>>");
			int dividend = scanner.nextInt();
			

			System.out.print("� ���� �����ðڽ��ϱ�?>>");
			int divisor = scanner.nextInt();

			int result = dividend / divisor;
			System.out.printf("%d / %d = %d", dividend, divisor, result);
		
			break;
			
		} catch (InputMismatchException e) {
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			
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
//				System.out.print("� ���� �����ðڽ��ϱ�?>>");
//				String data1 = scanner.nextLine();
//				int value1 = Integer.parseInt(data1);
//
//				System.out.print("� ���� �����ðڽ��ϱ�?>>");
//				String data2 = scanner.nextLine();
//				int value2 = Integer.parseInt(data2);
//
//				int result = value1 / value2;
//				System.out.printf("%d / %d = %d\n", value1, value2, result);
//				break;
//
//			} catch (NumberFormatException e) { // �巡�� + alt shift z
////			e.printStackTrace();
//				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
//			} catch (ArithmeticException e) { // �巡�� + alt shift z
////			e.printStackTrace();
//				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
//			}
//
//		}
//		scanner.close();
//
//	}
//}