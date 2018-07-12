package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ScannerMain {

	public static void main(String[] args) {
		// 키보드로부터 한 줄을 입력 받아서 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("한 줄의 문자열 입력: ");
		String msg = sc.next();
		System.out.println(msg);

		sc.close();// 스캐너를 사용하면 마지막에 닫아줘야 함.

		// 문자열로부터 받기
		sc = new Scanner("Hello Java");
		System.out.println(sc.next()); // 결과 : Hello
		System.out.println(sc.next()); // 결과 : Java

		// 파일과 연결되는 스캐너 객체 만들기
		File f = new File("C:\\Users\\503-12\\Documents\\jiyeshin\\필기노트\\필기노트_180702.txt");
		try {
			sc = new Scanner(f);
			//데이터가 있을 떄까지 읽기
			//파일은 있는데 내용을 못 읽는 경우는 2가지 경우임
			//구분문자가 없는 경우이거나 한글 인코딩이 서로 다른 경우임. 
			//한글 인코딩이 잘못되면 글자가 깨지는게 아니고 스캐너가 읽지를 못함
			//공백 문자를 찾아야 하는데 인코딩이 다르면 공백문자 코드값이 다름
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
