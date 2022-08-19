package chapter07;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // Car ��ü ����
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run(); // Car ��ü�� run() �޼ҵ� 5�� �ݺ� ����
			
			switch(problemLocation) {
			case 1: // �տ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
				
			case 2: // �տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
				
			case 3: // �ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
				
			case 4: // �ڿ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			}
			
			System.out.println("-----------------------"); // 1ȸ�� �� ��µǴ� ������ ����
		}
	}
}