package test01;

public class Exercise04 {// 배열에서 최대값 구하기

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for(int i=0; i<array.length; i++){ 
			if(i<array[i]){
				max=array[i];
			}
		}
		System.out.println("max: " + max);
	}

}
