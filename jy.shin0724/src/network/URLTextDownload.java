package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLTextDownload {

	public static void main(String[] args) {
		try {
			String addr = "https://www.naver.com"; // 1. 다운로드 받을 주소 만들기
			
			// 한글이 포함된 경우라면 URLEncoder.encode 메소드를 이용해서 한글을 인코딩
			//Strigng query=URLEncoder.encode("한글","utf-8");
			//addr=addr+query;
			
			
			URL url = new URL(addr); // 2. 주소를 가지고 URL 객체 생성
			HttpURLConnection con = (HttpURLConnection) url.openConnection(); // 3. URL 연결 객체를 생성

			// 4. 옵션 설정
			con.setConnectTimeout(30000); // 연결이 안되면 30초 시도
			con.setUseCaches(false); // 이전에 받은 데이터가 있어도 사용하지 않도록 설정

			// 5. 다운로드 받을 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			//6. 데이터를 읽어서 String으로 만들기
			StringBuilder sb=new StringBuilder(); //문자열을 복사하지 않고 편집할 수 있는 클래스의 객체 만들기
			while(true) {
				String line =br.readLine(); //한 줄의 문자열 읽기
				if(line ==null) { //읽은게 없으면 읽기 중단
					break;
				}
				sb.append(line+"\n"); //읽은 데이터가 있으면 sb에 추가
			}
			String html=sb.toString(); //읽은 데이터를 String으로 변환
			System.out.println(html);
			
			//7. 사용한 객체 정리
			br.close();
			con.disconnect();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
