package Exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �� ����");
		
		System.out.print("ö��: ");
		String boy = scanner.nextLine();
		
		System.out.print("����: ");
		String girl = scanner.nextLine();
		
		if(boy.equals("����")) {
			if(girl.equals("����")) {
				System.out.println("���: ���º�");
		}	else if(girl.equals("����"))
				System.out.println("���: ���� �¸�!");
			else
				System.out.println("���: ö�� �¸�!");
		}
			
		else if(boy.equals("����")) {
			if(girl.equals("����")) {
			System.out.println("���: ���º�");
		}	else if(girl.equals("����"))
			System.out.println("���: ö�� �¸�!");
			else
			System.out.println("���: ���� �¸�!");
		}
		
		else if(boy.equals("��")) {
			if(girl.equals("��")) {
			System.out.println("���: ���º�");
		}	else if(girl.equals("����"))
			System.out.println("���: ���� �¸�!");
			else
			System.out.println("���: ö�� �¸�!");
		}
		
		scanner.close();
	}
}

// if ���º�
// else if ö���� �̱�� ��� �� ����, ö�� �¸�
// else ������ ���� �¸�

