package apitest;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();
		int i;
		for (i = 1; i <= 1000000; i = i + 1) {
			System.out.println("Hello World");
		}
		long end = System.currentTimeMillis();
		System.out.println("작업시간: " + (end - start));*/

		// 환경변수 확인-path
		System.out.println(System.getenv("path"));

		// 시스템 속성 확인
		System.out.println(System.getProperty("java.version"));
		
		//파일 실행-Runtime
		Runtime r=Runtime.getRuntime();
		try {
			r.exec("notepad.exe C:\\Users\\503-12\\Documents\\jiyeshin\\필기노트\\필기노트_180702");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
