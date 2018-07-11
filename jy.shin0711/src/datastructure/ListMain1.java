package datastructure;

import java.util.*;

public class ListMain1 {

	public static void main(String[] args) {
		LinkedList<String> ar = new LinkedList<>();

		// 데이터 삽입
		ar.add("고건태");
		ar.add("김용국");
		ar.add("김상균");
		ar.add("노태현");
		ar.add("김동한");
		ar.add("권현빈");

		// 전체 데이터 출력
		for (String temp : ar) {
			System.out.println(temp);
		}

		// 데이터 개수
		System.out.println("데이터 개수: " + ar.size());

		// 두번째 데이터 출력
		System.out.println(ar.get(1));

	}

}
