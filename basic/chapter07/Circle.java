package chapter07;

public class Circle extends Shape {
	
	// �ʵ�
	double radius;
	
	// ������
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// �޼ҵ�
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double perimeter() {
		return Math.PI * (radius*2);
	}
	
	public String toString() {
		return String.format("������ ����: ��, �ѷ�:" + perimeter() + ", ����: " + area() + "��");
	}
}
