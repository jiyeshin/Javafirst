package io;

import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) {
		// 파일, 네트워크, 데이터베이스 관련 클래스들은 예외처리를 강제함.
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("./sample.txt"); //현재 디렉토리에 파일을 생성
			pw.println("Hello."); //파일에 문자열을 기록
			pw.flush(); //마지막에 버퍼의 내용을 전부 출력
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null)
				pw.close();
		}
	}
}
