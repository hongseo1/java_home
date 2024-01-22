package test01;

public class Exercise03 {// * 5열로 하나씩 늘리면서 출력

	public static void main(String[] args) {
		for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");             
            }            
            System.out.println();     
		}
	}

}
