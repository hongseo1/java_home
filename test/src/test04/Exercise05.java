package test04;

public class Exercise05 { //4x + 5y = 60의 모든 해를 구해서 ( x , y )형태로 출력 (단 10이하의 자연수)

	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
