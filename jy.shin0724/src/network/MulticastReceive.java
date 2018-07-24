package network;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceive {

	public static void main(String[] args) {
		try {
			
			MulticastSocket ms=new MulticastSocket(9999); //받는 멀티캐스트 소켓 만들기
			ms.joinGroup(InetAddress.getByName("230.100.50.5")); //그룹에 참여 224.0.0.0 부터 239.255.255.255 사이의 주소
		while(true) { //무한 반복해서 메시지 받기
			byte[]b=new byte[512]; //바이트 배열 생성
			DatagramPacket dp=new DatagramPacket(b,512); //데이터를 전송 받을 패킷 만들기
			ms.receive(dp); //데이터 받기: 데이터가 올 때까지 대기
			String msg=new String(b); //바이트 배열을 문자열로 변환하기
			System.out.println(msg.trim()); // 공백을 제거하고 화면에 출력
			
		}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
