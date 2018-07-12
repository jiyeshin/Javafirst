package datastructure;

import java.util.*;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		// 이름, 나이, 소속사를 저장하는 맵 생성
		
		TreeMap <String, Object> map = new TreeMap<>(); //맵 개체 만들기
		map.put("name", "김켄타");
		map.put("나이", 24);
		map.put("company", "SNT");
		
		//전체를 한꺼번에 출력-toString이 재정의 되어 있음
		System.out.println(map);
		
		//순서에 상관없이 항목별로 출력
		System.out.println("===================");
		Set<String> keys=map.keySet(); 
		//set메소드를 사용하지 않으면 map.get("name"); 처럼 하나하나 뽑아서 프린트 해야 함
		for(String a:keys) {
			System.out.println(a+": "+map.get(a));
		}
		

	}

}
