package test00;

public class ShopServiceTest {
	public static void main(String[] args) {
		ShopServiceTest test1 = new ShopServiceTest();
		ShopServiceTest test2 = new ShopServiceTest();
		
		if(test1 == test2){
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}

}
