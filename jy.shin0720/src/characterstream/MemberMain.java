package characterstream;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MemberMain {

	public static void main(String[] args) {

		// 키보드로부터 줄 단위로 입력을 받을 수 있는 클래스의 참조형 변수 선언
		// finall절에서 close를 할 수 있도록 try밖에서 변수를 선언함.
		BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("name: ");
			String name = br.readLine();
			System.out.print("age: ");
			String age = br.readLine(); // BufferedReader는 다 String으로 받음
			System.out.print("height: ");
			String height = br.readLine();

			// 3개의 데잍어를 하나로 저장하기 위한 인스턴스 생성
			Member member = new Member();
			member.setName(name);
			member.setAge(Integer.parseInt(age)); // 형 변환해서 넣어줌
			member.setHeight(Double.parseDouble(height));

			// 맵을 이용해서 저장
			Map<String, Object> map = new HashMap<>();
			map.put("name", name);
			map.put("age", Integer.parseInt(age));
			map.put("height", Double.parseDouble(height));

			// 출력할 떄는 VO 클래스나 Map이 별 차이 없음
			System.out.println(member);
			System.out.println(map);

			// 그러나 사용할 때는 차이 있음.
			int r = member.getAge() + 1;
			// r=map.get("age")+1; // map에서는 안됨. map에서는 데이터를 가져와서 사용할 때 강제 형 변환 해야함.
			r = (Integer) map.get("age") + 1;

		} catch (Exception e) {
			System.out.println("Exception:  " + e.getMessage());
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
