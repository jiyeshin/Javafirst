package datastructure;

import java.util.HashMap;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Object> map=new HashMap<>();
		map.put("name", "켄타");
		map.put("age", "24");
		map.put("company", "starroad");
		//동일한 키로 다시 저장하면 업데이트가 됨
		map.put("company", "fave");
		
		//company 키의 값을 출력
		System.out.println(map.get("company"));
		System.out.println(map.get("hoppy"));
		
		//모든 데이터 조회 - 저장할 때 사용한 키를 몰라도 조회 가능
		//모든 키를 set을 저장
		Set<String> amuguna = map.keySet();
		for(String temp: amuguna) {
			System.out.println(temp+": "+map.get(temp));
		}
	}

}
