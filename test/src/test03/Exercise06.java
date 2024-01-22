package test03;

public class Exercise06 {// 사다리꼴의 넓이 소수점 정확히 자릿수까지 구하기

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double) (lengthTop + lengthBottom) / 2 * height);
		System.out.println(area);
	}

}
