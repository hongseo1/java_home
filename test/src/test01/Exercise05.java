package test01;

public class Exercise05 {// 1~10까지의 합 구하기

	public static void main(String[] args) {
		int total = 0;
        for(int i=1; i<=10; i++){
            total+=i;
            System.out.print(i);
            if(i!=10){
               System.out.print("+");
            }
        }
        System.out.print("=" + total); 
	}

}
