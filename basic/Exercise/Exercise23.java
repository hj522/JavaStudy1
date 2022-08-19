package Exercise;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원기둥 밑면의 반지름을 입력하시오.(단위: cm): "); // ln 지우기
		double value1 = scanner.nextDouble(); //radius
		
		System.out.println("원기둥의 높이를 입력하시오.(단위: cm) ");
		double value2 = scanner.nextDouble(); //height
		
		double value3 = (value1 * value1) * Math.PI; //area
		double value4 = value3 * value2; //volume
		
		System.out.println("원기둥 밑면의 넓이는 " + value3 + "㎠이고, "
				+ "원기둥의 부피는 " + value4 + "㎠이다.");
		
	}

}

/*
 * System.out.printf("원기둥 밑면의 넓이: %f㎠이고, 부피: %f㎤이다.", area, volume);
 * scanner.close();
 */