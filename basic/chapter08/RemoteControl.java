package chapter08;

public interface RemoteControl {
	int MAX_VOLUME = 10; // 상수
	int MIN_VOLUME = 0;
	
	public void turnOn(); // 추상 메소드 작성
	public void turnOff();
	public void setVolume(int volume);
	
	
}
