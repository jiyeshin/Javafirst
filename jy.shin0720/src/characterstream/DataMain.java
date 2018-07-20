package characterstream;

import java.io.*;
import java.util.*;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader bfr = null;

		try {
			bfr = new BufferedReader(new FileReader("C:\\Users\\503-12\\Documents\\jiyeshin\\access_log.txt"));

			// 접속한 아이피를 중복 상관 없이 저장하기 위한 자료구조
			ArrayList<String> iplist = new ArrayList<>();

			// 중복 없이 저장하기 위한 set 만들기
			Set<String> ipset = new HashSet<>();

			while (true) {
				String line = bfr.readLine();
				// System.out.println(line); //line에 들어간 데이터 전체가 출력됨.
				if (line == null)
					break;

				String[] ar = line.split(" "); // 공백으로 분할

				iplist.add(ar[0]);
				ipset.add(ar[0]);
			}
			/*
			 * for(String ip:iplist) { System.out.println(ip); }
			 */

			for (String ips : ipset) {
				System.out.println(ips);
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			try {
				if (bfr != null)
					bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
