package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("��ȣ\t�̸�\t����"); // [\t] �Ǹ�ŭ ���
		System.out.println("�� ���� ���\n"); // [\n] �� �ٲ�
		System.out.println("�� ���� ���\n"); // [\n] �� �ٲ�
		System.out.println("�츮�� \"������\" �Դϴ�."); // [\"] "���
		System.out.println("��\\����\\����\\�ܿ�"); // [\\] \���
		
		String str = "���� \"�ڹ�\"�� �����մϴ�."; // ū ����ǥ ������ ��� �Ұ�. �߰��� �̽������� ���� Ȱ��
		System.out.println(str);
	}
}
