package Exercise;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		int num1 = scanner.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		int num2 = scanner.nextInt();
		
		int value1 = ((num1 + num2) + (Math.abs(num1 - num2))) / 2;
		int value2 = ((num1 + num2) - (Math.abs(num1 - num2))) / 2;
		
		scanner.close();
		
		
		System.out.print("ū ���� ���� ���� ���� ���� " + value1 / value2 + "�̰�, �������� " + value1 % value2 + "�̴�.");
}
}

/*
 * 0�� �Է����� �ʰ� �ڵ� ¥��
 * ���밪�� ��ȯ�ϴ� �޼ҵ� = Math.abs(����) ���
 */