package chapter07;

public class SupersonicAirplane extends AirPlane{
	public static final int NORMAl = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAl;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		} else {
			super.fly(); // Airplane ��ü�� fly() �޼ҵ� ȣ��
		}
	}
}
