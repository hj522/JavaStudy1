package chapter03;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		double value1 = scanner.nextDouble();
		
		System.out.print("�� ��° ��: ");
		double value2 = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("--------------");
		
		double value3 = value1 / value2;

		if(value2 == 0) {		
		System.out.println("���:���Ѵ�");	
		}
		else {
		System.out.print("���: " + value3);
		}
	}
}

/*
 * ù ��° ���� �� ��° ���� ���� ����� "���:��" ���� ���
 * �� ��° ���� 0 �Ǵ� 0.0�� �ԷµǾ��� ��� "���:���Ѵ�"�� ��µǵ��� �ۼ�
 * 
 * double num3 = num1/num2;
 * String num5 = String.valueOf(num3);
 * String num4 = (num2==0||num2==0.0) ? "���Ѵ�" : num5;
 * System.out.println("���:" + num4);
 */
