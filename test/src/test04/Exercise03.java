package test04;

public class Exercise03 { //1~100까지의 정수 중 3의 배수의 합 구하기

	public static void main(String[] args) {
		 int total = 0;
	     for(int i=0; i<=100; i++){
	         if((i%3)==0){
	             total+=i;
	         }
	     }  
	     System.out.println(total);
	}

}
