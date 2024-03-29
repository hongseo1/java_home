package sec01.exam01;

public class A {
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	//인스턴스 멤버 클래스
	public class B {
		B(){
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		//static int field2;
		void method1() {}
		//static void method2(){}
	}
	
	//정적 멤버 클래스
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		//로컬 클래스
		class D {
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() { }
			//static void method2() { }
			//static A클래스 객체 생성 없이 static을 사용할 수 없다.
			//D클래스는 A클래스 안에 method의 지역 클래스이기 때문
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
