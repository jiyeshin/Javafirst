package network;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSend {

	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket(); // 보내는 멀티캐스트소켓을 생성
			Scanner sc = new Scanner(System.in); // 문자열을 입력 받기 위한 스캐너 생성
			System.out.print("nickname: ");
			String nick = sc.nextLine();
			String str=nick+" is entered.";

			while (true) {
				System.out.print("msg(end for exit): ");
				String msg = sc.nextLine();
				if (msg.equals("end")) {
					msg = nick + " is exited.";

					// 보내는 패킷 만들기: 내용, 길이, 받을곳의 주소, 포트번호
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("230.100.50.5"), 9999);
					ms.send(dp); // 데이터 전송
					ms.close();
					sc.close();
					break;
				} else {
					msg = nick + ": " + msg;
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("230.100.50.5"), 9999);
					ms.send(dp);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
