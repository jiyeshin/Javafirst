package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressMain {

	public static void main(String[] args) {
		try {

			InetAddress addr = InetAddress.getByName("www.choongang.co.kr");
			System.out.println(addr);
			System.out.println("===================");
			InetAddress[] ar = InetAddress.getAllByName("www.google.co.kr");
			for (InetAddress imsi : ar) {
				System.out.println(imsi);
			}
		} catch (UnknownHostException e) {

			e.printStackTrace();
		}

	}

}
