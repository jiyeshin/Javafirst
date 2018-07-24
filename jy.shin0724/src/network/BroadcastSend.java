package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class BroadcastSend {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(); // UDP 전송을 위한 소켓 행성

			Scanner sc = new Scanner(System.in); // 스캐너로 닉네임 입력 받기
			System.out.print("닉네임 입력: ");
			String nick = sc.nextLine();

			String msg = nick + "님이 전송할 준비가 되었습니다."; // 전송할 배열을 만듦

			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
					InetAddress.getByName("192.168.0.255"), 7777);
			
			ds.send(dp);
			
			while(true) {
				System.out.print("메시지: ");
				msg=sc.nextLine();
				msg=nick+": "+msg;
				dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
						InetAddress.getByName("192.168.0.255"), 7777);
				ds.send(dp);
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
