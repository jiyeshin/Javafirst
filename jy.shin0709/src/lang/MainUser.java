package lang;

public class MainUser {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setNum(1);
		user1.setName("고건태");
		String[] hobbies = { "노래", "춤", "쇼핑" };
		user1.setHobbies(hobbies);
		//toString을 호출해서 내부 내용 확인
		//System.out.println(user1);
		
		//user1의 데이터가 저장된 곳의 주소를 user에 복사
		//참조형 데이터의 복사와 같은 원리
		User user2=user1;
		user2.setNum(2);
		System.out.println(user1);
		
		User user3=user1.clone();
		user3.setNum(3);
		user3.setName("켄타");
		user3.getHobbies()[0]="라떼아트";
		System.out.println(user1);
		System.out.println(user3);
		
	}

}
