package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {

	public static void main(String[] args) {
		// UDP 전송 받는 곳 //예외처리 무조건 해야 함
		try {
			DatagramSocket ds = new DatagramSocket(5000);
			while (true) {
				byte[] b = new byte[1024]; // 데이터를 저장할 배열을 생성
				DatagramPacket dp = new DatagramPacket(b, 1024); // DatagramPacket 생성
				ds.receive(dp);// 데이터 받기
				String msg = new String(b, 0, 1024);
				System.out.println("from: " + dp.getAddress());
				System.out.println("msg: " + msg);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
