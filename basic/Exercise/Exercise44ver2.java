package Exercise;

import java.util.Scanner;

public class Exercise44ver2 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �� ����");
		
		System.out.print("ö��: ");
		String boy = scanner.nextLine();
		
		System.out.print("����: ");
		String girl = scanner.nextLine();
		
		String result = "";
		
		if(boy.equals(girl)) {
			result = "���º�";
		} else if (boy.equals("����") && girl.equals("��") || boy.equals("��") && girl.equals("����") || boy.equals("����") && girl.equals("����")) {
			result = "ö�� �¸�!";
		} else {
			result = "���� �¸�!";
}
		System.out.println("���: " + result);
		
		scanner.close();
}
}

// ���� ������ ������ �ϱ��� ��
