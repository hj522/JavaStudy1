package Exercise.Interface;

public class Triangle extends Shape {

	// �ʵ�
	double side;

	// ������

	public Triangle() {
	}

	public Triangle(double side) {
		this.side = side;
	}

	// �޼ҵ�

	@Override
	public double area() {
		return (Math.sqrt(3) / 4) * side * side;
	}

	@Override
	public double perimeter() {
		return side * 3;
	}

	public String toString(){
		return String.format("������ ����: �ﰢ��, �ѷ�: %.2fcm, ����: %.2f��", perimeter(), area());
	}
}
