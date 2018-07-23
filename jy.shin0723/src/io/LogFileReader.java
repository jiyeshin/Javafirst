package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class LogFileReader {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader("C:\\Users\\503-12\\Downloads\\access_log.txt"));
			StringBuilder sb = new StringBuilder();
			HashMap<String, Integer> map = new HashMap<>();
			HashMap<String, Integer> traffic = new HashMap<>();

			while (true) {

				String line = bf.readLine();
				if (line == null)
					break;
				String[] ar = line.split(" ");
				// System.out.println(ar[0]);
				Integer count = map.get(ar[0]);
				if (count == null) {
					map.put(ar[0], 1);
				} else {
					map.put(ar[0], count + 1);
				}
				Integer trf = traffic.get(ar[0]);
				if (trf == null) {
					if (!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
						traffic.put(ar[0], Integer.parseInt(ar[9]));
					}
				} else {
					if (!ar[9].equals("\"-\"") && !ar[9].equals("-")) {
						traffic.put(ar[0], trf + Integer.parseInt(ar[9]));
					}
				}

			}

			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				System.out.println(key + ": " + map.get(key));
			}
			System.out.println("=======================");
			keySet = traffic.keySet();
			for (String key : keySet) {
				System.out.println(key + ": " + traffic.get(key));
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			if (bf != null)
				try {
					bf.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
		}

	}

}
