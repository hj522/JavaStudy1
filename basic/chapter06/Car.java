package chapter06;

public class Car {
	
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������1
	Car() {
	}
	
	Car(String model) {
		this.model = model; // ������2
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color; // ������3
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; // ������4
	}
}
