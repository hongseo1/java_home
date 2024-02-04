package sec01.exam12;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); //엔터기 (2) 입력 값을 제외하고 
		System.out.println(str);
	}

}
