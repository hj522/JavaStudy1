package Exercise;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ ���̴�?(����: m):"); // ln �����
		double width = scanner.nextDouble();
		
		System.out.println("������ ���̴�?(����: m):");
		double height = scanner.nextDouble();
		
		double result = width * height;
		System.out.println("���簢���� ����: " + result);
		double result2 = (width + height) * 2;
		System.out.println("���簢���� �ѷ�: " + result2);
}
}

/*
 * �Է�
 * System.out.print("������ ���̴�?(����: m):");
 * double width = scanner.nextDouble();
 * System.out.println("������ ���̴�?(����: m):");
 * double height = scanner.nextDouble();
 * 
 * ó��
 * double area = width * height;
 * double perimeter = (width + height) *2
 * 
 * ���
 * System.out.println("���簢���� ����: " + area);
 * System.out.println("���簢���� �ѷ�: " + perimeter);
 * 
 * scanner.close();
 */
 