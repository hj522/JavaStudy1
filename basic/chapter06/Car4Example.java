package chapter06;

public class Car4Example {
	public static void main(String[] args) {
		Car4 myCar = new Car4();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		// ����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
	}
}
