package chapter02;

import java.util.Scanner;

public class inputExample {
	public static void main(String[] args) {
		// Scanner�� �̿��ؼ� ������ �Է� �ޱ�
		Scanner scanner = new Scanner(System.in); //ctrl+1
		
		int value1 = scanner.nextInt();
		
		scanner.close();
	}
}
