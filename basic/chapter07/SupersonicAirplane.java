package chapter07;

public class SupersonicAirplane extends AirPlane{
	public static final int NORMAl = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAl;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); // Airplane 객체의 fly() 메소드 호출
		}
	}
}
