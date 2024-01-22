package test03;

public class Exercise05 {// 정수 356 십의 자리수 버리기

	public static void main(String[] args) {
		int value = 356;
		System.out.println(value-(value%100));// 또는 (value/100) * 100
	}

}
