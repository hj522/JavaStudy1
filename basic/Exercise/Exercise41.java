package Exercise;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ﰢ���� ù��° ���� ���̸� �Է��ϼ���: ");
		int length1 = scanner.nextInt();
		
		System.out.print("�ﰢ���� �ι�° ���� ���̸� �Է��ϼ���: ");
		int length2 = scanner.nextInt();

		System.out.print("�ﰢ���� ����° ���� ���̸� �Է��ϼ���: ");
		int length3 = scanner.nextInt();
		
		
		if ((length1 + length2) < length3 || (length2 + length3) < length1 || (length3 + length1) < length2) {
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		}
		  else
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");

		scanner.close();
	}
}

/*
 * ���� �� ���� ���̰�
 * �ٸ� �� ���� ������ �պ��� ������
 * �ﰢ���� ���� �� �ִ�.
 */
