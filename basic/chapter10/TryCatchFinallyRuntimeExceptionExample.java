package chapter10;

import java.util.Scanner;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
					
//		int value1 = 0;
//		int value2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		try {
			System.out.print("ù��° ���ڸ� �Է��ϼ���>");
			String data1 = scanner.nextLine();
			System.out.print("�ι�° ���ڸ� �Է��ϼ���>");
			String data2 = scanner.nextLine();
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%d + %d = %d\n", value1, value2, result);
			break;
		} catch (NumberFormatException e) {	//�巡�� + alt shift z
//			e.printStackTrace();
			System.out.println("���ڸ� �Է��ϼ���.");
			}
		
 		}
		
		scanner.close();
	}
}
