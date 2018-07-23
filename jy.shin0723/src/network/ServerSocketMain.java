package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(9996); //서버 소켓 생성
			while(true) {
				System.out.println("now loading...");
				Socket socket=ss.accept(); // 클라이언트 접속 대기
				//클라이언트가접속하면 클라이언트와의 통신을 위한 소켓을 리턴하고 다음줄의 코드 실행
				
				//한 줄의 데이터를 읽어서 출력
				BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String msg=br.readLine();
				System.out.println("message: "+msg);
				System.out.println("접속자: "+socket.getInetAddress());
				socket.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
