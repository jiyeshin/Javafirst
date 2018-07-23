package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class LogFile{

	public static void main(String[] args) {
		// 1.BufferedReader 객체 만들기
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new FileReader("C:\\Users\\503-12\\Downloads\\access_log.txt"));
			//4.HashMap을 이용해서 접속한 IP 별 횟수를 출력
			HashMap<String, Integer> map = 
				new HashMap<>();
			//5.HashMap을 이용해서 접속할 IP 별 트래픽 합계 출력
			HashMap<String, Integer> traffic = 
				new HashMap<>();
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//System.out.println(line);
				String [] ar = line.split(" ");
				//System.out.println(ar[0]);
				//ip로 저장된 데이터를 가져옵니다.
				Integer count = map.get(ar[0]);
				//저장된 데이터가 없으면 1을 저장합니다.
				if(count == null) {
					map.put(ar[0], 1);
				}
				//저장된 데이터가 있으면 1을 더해서 저장합니다.
				else {
					map.put(ar[0], count + 1);
				}
				
				Integer traf = traffic.get(ar[0]);
				if(traf == null) {
					if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
						traffic.put(ar[0],
							Integer.parseInt(ar[9]));
					}
				}else {
					if(!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
						traffic.put(ar[0], 
							traf + Integer.parseInt(ar[9]));
					}
				}
				
			}
			
			//맵의 모든 데이터를 출력
			Set<String> keySet = map.keySet();
			for(String key : keySet) {
				System.out.println(
						key + ":" + map.get(key));
			}
			
			System.out.println("================");
			keySet = traffic.keySet();
			for(String key : keySet) {
				System.out.println(
						key + ":" + traffic.get(key));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
