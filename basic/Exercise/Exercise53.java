package Exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		// �Է�
		
		System.out.print("���� ���� ���� �Է��ϼ���: ");
		String player = scanner.nextLine();
	
		String[] cpu = {"����", "����", "��"}; // ���� ���� ���� ���ڶ� �������� �����Ⱑ �Ұ���
		Random random = new Random();
		String computer = cpu[random.nextInt(3)]; // -> �迭�� �ε��� 0~2�� �̿��ؼ� ���� ���

		// ó��
		
		String result = " ";
		
		if(player == computer) {
			result = ("���̸�: " + player + "\n�ΰ����� ��ǻ��: " + computer + "\n���: ���º�!");
			System.out.println(result);
			
		} else if ((player.equals("����") && computer.equals("��")) 
				|| (player.equals("��") && computer.equals("����"))
				|| (player.equals("����") && computer.equals("����"))) {
			result = ("���̸�: " + player + "\n�ΰ����� ��ǻ��: " + computer + "\n���: �÷��̾� �¸�!");
			System.out.println(result);
			
		} else {
			result = ("���̸�: " + player + "\n�ΰ����� ��ǻ��: " + computer + "\n���: ��ǻ�� �¸�!");
			System.out.println(result);
			
			scanner.close();
	}

}
}



/*
 * Scanner scanner = new Scanner(System.in);
 * Random random = new Random();
 * String gamer; //�Է� ���� ��
 * int aiNum = random.nextInt(3); // 0~2���� ������ ������
 * int gamStr=0; // �Է� ���� ������ 
 * System.out.println("���� ���� �� ����");
 * System.out.print("���̸�:");
 * gamer=scanner.nextLine();
 *
 * //����� ���������� ���ڸ� 0~2�� ����
 * if(gamer.equals("����")) {
 * 	gamStr = 0;
 * } else if (gamer.equals("����")) {
 * gamStr = 1;
 * } else if (gamer.equals("��")) {
 * gamStr = 2;
 * }
 * 
 * if(aiNum==0) {
 * System.out.println("�ΰ����� ��ǻ�� : ����");
 * } else if (aiNum ==1) {
 * System.out.println("�ΰ����� ��ǻ�� : ����");
 * } else if (aiNum==2) {
 * System.out.println("�ΰ����� ��ǻ�� : ��");
 * }
 * 
 * �Է¹��� gamStr ���� ���� ���� ��
 * 
 * switch (gamStr) {
 * case 0:
 * 	if(aiNum==0) {
 *	System.out.print("�����ϴ�.)";
 * } else if(aiNum==1) {
 * System.out.print("���: ��ǻ�� �¸�!")
 * } else if(aiNum==2) {
 * System.out.print("���̸� �¸�");
 * }
 * break;
 * 
 *
 * case 1:
 *  	if(aiNum==0) {
 *	System.out.print("");
 * } else if(aiNum==1) {
 * System.out.print("")
 * } else if(aiNum==2) {
 * System.out.print("");
 * }
 * break;
 
 * 
 * case 2:
 *  	if(aiNum==0) {
 *	System.out.print("���: ��ǻ�� �¸�!)";
 * } else if(aiNum==1) {
 * System.out.print("���: ���̸� �¸�!")
 * } else if(aiNum==2) {
 * System.out.print("�����ϴ�.");
 * }
 * break;
 */
