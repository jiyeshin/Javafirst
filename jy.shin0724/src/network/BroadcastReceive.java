package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BroadcastReceive {

	public static void main(String[] args) {
		//파일처리, 네트워크, DB때는 예외처리 함.
		try { 
			DatagramSocket ds=new DatagramSocket(7777); //UDP 방식으로 데이터를 전송받을 수 있는 소켓. 포트번호 필수
			System.out.println("서버 대기중... ");
			while(true) {
				//메시지를 받을 땐 항상 저장할 배열을 생성
				byte[]b=new byte[512]; //배열의 크기는 주로 짝수
				
				//메시지를 저장할 DatagramPacket 생성
				DatagramPacket dp=new DatagramPacket(b,512);
				
				ds.receive(dp); //데이터 받기
				
				//데이터를 읽기 위한 변수 선언
				String msg=new String(b);
				System.out.println(msg.trim()); //받은 데이터가 512바이트가 되지 않을 때도 있으므로 공백 제거 위해 trim()호출
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
