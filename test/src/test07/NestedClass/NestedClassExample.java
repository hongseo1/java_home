package test07.NestedClass;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//인스턴스 멤버 클래스 객체 생성
		Car.Tire tire = myCar.new Tire();
		
		//정적 멤버 클래스 객체 생성
		Car.Engin engin = new Car.Engin();
	}

}
