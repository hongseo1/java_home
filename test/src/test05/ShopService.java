package test05;

public class ShopService {
	/*ShopService 객체를 싱글톤으로 만들고 싶습니다. 
	ShopServiceExample 클래스에서 ShopService의 getInstance( ) 
	메소드로 싱글톤을 얻을 수 있도록 ShopService 클래스를 작성해보세요.*/
	
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return singleton;
	}
}
