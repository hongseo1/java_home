package test04;

public class Exercise04 { //주사위 2개의 합이 5일 경우 정지

	public static void main(String[] args) {
		int result = 0;
		
		while(result!=5) { // 합이 5가 아니면 계속 실행
			int num1 = (int)(Math.random()*6) + 1; 
			int num2 = (int)(Math.random()*6) + 1; 
			result = num1 + num2;
			System.out.println(num1+","+num2);
		}
	}

}
