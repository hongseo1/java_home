package sec02.exam03;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(i=1; i<=100; i++) { // 위에서 선언(초기값) i = 100 (101)
			sum += i;
		}
		
		System.out.println("1~ " + (i-1) + " 합: " + sum);

	}

}
