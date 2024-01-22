package test03;

public class Exercise02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 뒷 ++, --은 연산식이 오면 계산 하기 때문에 ++x=11/ y--=20
		System.out.println(z); //z=31
	}

}
