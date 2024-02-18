package test07.interfaceSoundable;

public class Dog implements Soundable {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
