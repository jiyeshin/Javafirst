package network;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLFileDownload {

	public static void main(String[] args) throws IOException {
		try {
			//다운받을 주소 만들기
			String addr="http://img.etoday.co.kr/pto_db/2017/07/600/20170710053714_1093286_610_614.jpg";
			
			//addr에서 마지막 슬래시 이후의 문자열을 가져오기
			int idx=addr.lastIndexOf("/"); //마지막 슬래시의 위치를 찾음
			String filename=addr.substring(idx+1); //addr에서 idx+1번째 글자부터 가져오기
			System.out.println(filename);
			
			//filename을 이용해서 저장할 파일 경로 만들기
			String filepath="C:\\Users\\503-12\\Documents\\" + filename;
			if((new File(filepath)).exists()){
				System.out.println("이미 파일이 존재합니다.");
			}else {
				//System.out.println("파일이 존재하지 않습니다.");
				Thread th=new Thread() {
					public void run()  {
						try {
							URL url=new URL(addr); //다운로드 받을 URL 만들기
							HttpURLConnection con=(HttpURLConnection)url.openConnection(); //연결 객체 생성
							
							//옵션 설정
							con.setConnectTimeout(20000);
							con.setUseCaches(false);
							
							//바이트 단위로 다룬로드 받기 위한 스트림 생성 //참고로 읽는건 BufferedReaderStream
							BufferedInputStream bis=new BufferedInputStream(con.getInputStream()); 
							PrintStream ps=new PrintStream(filepath);
							while(true) {
								byte[]b=new byte[512]; //512바이트 단위로 데이터 읽기
								int r=bis.read(b);
								if(r<=0) { // 읽은 데이터가 없으면 읽기 중단
									break;
								}
								ps.write(b,0,r); //읽은 데이터를 ps를 이용해서 기록
							}
							
							//전부 기록했으면 정리
							ps.close();
							bis.close();
							con.disconnect();
							
							
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				};
				th.start(); //스레드 시작
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
