package Exercise.Interface;

public class Circle extends Shape {
	
	// 필드
	double radius;
	
	// 생성자
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 메소드
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double perimeter() {
		return Math.PI * (radius*2);
	}
	
	public String toString() {
//		return "도형의 종류: 원, 둘레:" + perimeter() + ", 넓이: " + area() + "㎠";
		return String.format("도형의 종류: 원, 둘레: %.2fcm, 넓이: %.2f㎠", perimeter(), area());
	 }
}
