package datastructure;

import java.util.*;

public class ListMain3 {

	public static void main(String[] args) {
//// 정수 List와 문자열 List의 정렬
		//정수 List		
		ArrayList <Integer> intal=new ArrayList<>();
		intal.add(40);
		intal.add(30);
		intal.add(35);
		
		Comparator<Integer>comp=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer first=(Integer)o1;
				Integer second=(Integer)o2;
				return first-second;
			}
		};
		
		intal.sort(comp);
		//List는 toString 재정의가 되어 있어서 인스턴스를 출력하면 데이터가 순서대로 toString을 호출함
		System.out.println(intal);
		
		
		//문자열 List
		LinkedList<String>strll=new LinkedList<>();
		strll.add("판타지");
		strll.add("꽃이야");
		strll.add("부를게");
		
		Comparator<String>compstr=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String first=(String)o1;
				String second=(String)o2;
				
				return second.compareTo(first);
			}
			
		};
		strll.sort(compstr);
		System.out.println(strll);
		
	}

}
