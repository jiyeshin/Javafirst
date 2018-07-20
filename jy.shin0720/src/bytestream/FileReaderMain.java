package bytestream;

import java.io.FileReader;
import java.io.*;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {
		FileReader fr = null;

		try {
			fr = new FileReader("C:\\Users\\503-12\\git\\Javafirst\\jy.shin0720\\char.txt");
			char[] buf = new char[10]; 
			while (true) { //배열에서 0번째부터 r까지만 문자열로 변환해서 출력
				
				int r = fr.read(buf); //buf의 크기만큼 읽어서 buf에 저장하고 읽은 개수를 r에 저장
				if (r <= 0)
					break;

			
			System.out.println(new String(buf, 0, r));}

			/*
			 * for(char ch:buf) { System.out.println(ch); } //한글자 씩 찍어낼 때
			 */
			//System.out.println(new String(buf)); // 한번만 읽을 때

		} catch (Exception e) {
			System.out.println("Exception for File Reader " + e.getMessage());
		} finally {
			if (fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	}
