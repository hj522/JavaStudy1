package chapter03;

public class Q8 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((0.5 * (lengthTop + lengthBottom)) * height);
		System.out.println(area);
	}
}

/*소수 자릿수가 정확히 나올 수 있도록 넓이 계산
사다리꼴 넓이 구하는 공식 = (윗변+아랫변)*높이 / 2
double area = ((lengthTop + lengthBottom) * height / 2.0);
*/