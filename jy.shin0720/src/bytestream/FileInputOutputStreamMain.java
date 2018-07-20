package bytestream;

import java.io.*;

public class FileInputOutputStreamMain {

	public static void main(String[] args) {
		FileOutputStream fos = null; // 파일에 바이트 단위로 기록할 수 있는 스트림 변수 생성

		//// try-catch-finally는 각각 별개의 블럭
		try {// 예외가 발생할 가능성이 있는 구문
			fos = new FileOutputStream("./0720byte.txt",true); // 현재 프로젝트 디렉토리에 파일을 생성, true를 쓰면 이어쓰기
			// fos.write(100); //파일에 1바이트 기록: a가 출력됨

			// byte[]ar= {97,98,99,100,101};
			// fos.write(ar);

			String str = "Hello "; // 문자열을 바이트 배열로 변환해서 기록
			fos.write(str.getBytes()); // getBytes이용: 중요!!

			fos.flush(); // 버퍼의 내용을 비우기

		} catch (Exception e) { // 예외가 발생했을 때 수행할 구문
			System.out.println("Exception for File Output: " + e.getMessage());

			// 현재 날짜와 시간, 예외 내용을 로깅
			// 파일에 기록하거나 네트워크를 통해서 서버에 전달

		} finally {// 파일에 기록할 때는 finally까지 해줘야. 아님 안해도 됨
			// 예외 발생 여부에 상관없이 수행할 구문
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		try {
			fis=new FileInputStream("./0720byte.txt");
			
			//int r=fis.read(); //1byte 읽어오기
			//System.out.println(r);
			
			/*byte[]b=new byte[4]; //4byte 읽기
			fis.read(b);
			System.out.println(b.toString());*/
			
			//4byte씩 전체 읽기
			//read에 바이트 배열을 대입하면 읽은 개수를 리턴
			//0보다 작거나 같은 값을 리턴하면 읽을 데이터가 없는 것임.
			while(true) {
				byte[]b=new byte[4];
				int r=fis.read(b);
				//System.out.println(b); //배열은 toString이 재정의 되어 있지 않아서 해시코드가 출력
				
				//코드를 각각 출력
				/*for(byte imsi:b) {
					System.out.println(imsi);
				}
				if(r<=0)break;*/
				
				//문자열로 변환해서 출력
				System.out.println(new String(b));
				if(r<=0)break;
			}

		} catch (Exception e) {
			System.out.println("Exception for File Input" + e.getMessage());

		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

		}

	}

}
