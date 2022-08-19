package chapter09;

public class Button {
	OnClickListener listener; // �������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener; // �Ű� ������ ������
	}
	
	void touch() {
		listener.onClick(); // ���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	static interface OnClickListener {
		void onClick(); // ��ø �������̽�
	}
}
