package Exercise;

public class Rectangle extends Shape {

	// �ʵ�
	double width;
	double height;
	
	// ������
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// �޼ҵ�
	
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public double perimeter() {
		return (width+height)*2;
	}
	
	public String toString() {
		return String.format("������ ����: �簢��, �ѷ�:" + perimeter() + ", ����: " + area() + "��");
}
}
