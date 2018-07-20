package characterstream;

import java.io.*;
import java.io.IOException;

public class StringBuilderMain {

	public static void main(String[] args) {
		BufferedReader bfr = null;

		try {
			bfr = new BufferedReader(new FileReader("C:\\Users\\503-12\\Documents\\jiyeshin\\log.txt"));

			// 줄 단위로 데이터를 이어 붙일 StringBuilder인스턴스 생성
			StringBuilder sb = new StringBuilder();
			while (true) {
				String line = bfr.readLine();
				if (line == null)
					break; // 읽은 데이터가 없으면 종료
				sb.append(line); // 읽은 데이터가 있으면 sb에 추가
			}

			String content = sb.toString(); // 읽은 내용을 String에 저장하기
			sb = null;
			System.out.println(content);

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			try {
				if (bfr != null)
					bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
