package chapter03;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̵�:");
		String name = scanner.nextLine();
		
		System.out.println("�н�����:");
		String strPassword = scanner.nextLine();
		int password =Integer.parseInt(strPassword);
		
		scanner.close();
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			} 
		} else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}
	}
}
		
/*
 * ���̵� java �н����尡 12345 ��� "�α��� ����" ���
 * �׷��� ������ "�α��� ����" �� ����� �ǵ��� �ڵ� ¥��
 */
