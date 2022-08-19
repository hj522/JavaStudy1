package chapter08;

// �߻�Ŭ���� : Ŭ���� -> ���(extends)
// �������̽� : Ŭ���� -> ����(implements)
public class Television implements RemoteControl {

	private int volume;
		
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("���� TV ����: " + this.volume);
	}
}
