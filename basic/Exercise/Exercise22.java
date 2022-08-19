package Exercise;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distance = 40e12;
		double speed = 300000;
		double time = 31536000; // (60 * 60 * 24 * 365) 값
		double result = (distance / speed) / time;
		
		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + result + "광년이다.");
	}
}

/*
 *double result = distance / speed; 만 하면 1.33333333333333333E8(?) 초 단위로 출력이 됨
 *초 단위를 년 단위로 바꾸어야 함
 *(60 * 60 * 24 * 365) <- 1년에 해당하는 초
 *double result = distance / speed / 60 / 60 / 24 / 365; 로 계산
 */
