package test07.Anonymous;

public class AnonExample {

	public static void main(String[] args) {
		Anonymous annoy = new Anonymous();
		
		annoy.field.run();
		annoy.method1();
		annoy.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				}
		);
	}

}
