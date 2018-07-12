package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogMain {

	public static void main(String[] args) {
		// 로그 파일의 내용을 읽는 스캐너 만들기
		File f = new File("C:\\Users\\503-12\\Documents\\jiyeshin\\학습자료\\java 박문석 선생님\\java\\log.txt");

		HashSet<String> set = new HashSet<>();
		try {
			Scanner sc = new Scanner(f);
			int sum = 0;
			while (sc.hasNextLine()) {
				// System.out.println(sc.nextLine()); //한줄씩 읽기
				String temp = sc.nextLine();
				String[] ar = temp.split(" ");// 공백으로 분할

				// 10번째 데이터 확인
				// System.out.println(ar[9]);

				// 10번째 문자열을 정수로 변환해서 smu에 더하기
				sum = sum + Integer.parseInt(ar[9]);

			}
			System.out.println("트래픽 합계: " + sum);
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());

		}

	}

}
