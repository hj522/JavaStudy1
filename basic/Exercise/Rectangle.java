package Exercise;

public class Rectangle extends Shape {

	// 필드
	double width;
	double height;
	
	// 생성자
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// 메소드
	
	@Override
	public double area() {
		return width * height;
	}
	
	@Override
	public double perimeter() {
		return (width+height)*2;
	}
	
	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레:" + perimeter() + ", 넓이: " + area() + "㎠");
}
}
