package chapter01;

public class practice2 {
	public static void main(String[] args) {
		int x = 100;
		int y = 1000;
		System.out.println("x: " + x + " " + "y: " + y);
		
		int hello;
		hello = x;
		x = y;
		y = hello;
		System.out.println("x: " + x + " " + "y: " + y);
	}
}
