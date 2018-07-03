package method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//// Member클래스에 인스턴스 생성
		Member member1 = new Member();
		
////직접 입력
		/*
		 * member1.setUsername("유저네임"); member1.setEmail("이메일@email.com");
		 * member1.setPassword("1234"); member1.setPhone("01012345678");
		 * member1.setBirth("950110"); member1.setAge(24);
		 */
////스캐너로 입력
		/*Scanner sc = new Scanner(System.in);
		System.out.print("유저네임: ");
		String username = sc.nextLine();
		member1.setUsername(username);

		System.out.print("이메일: ");
		String email = sc.nextLine();
		member1.setEmail(email);

		System.out.print("비번: ");
		String password = sc.nextLine();
		member1.setPassword(password);

		System.out.print("전번: ");
		String phone = sc.nextLine();
		member1.setPhone(phone);
		
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		member1.setBirth(birth);
		
		System.out.print("나이: ");
		int age = sc.nextInt();
		member1.setAge(age);*/

//// 인스턴스로 출력하는 방법
		/*
		 * System.out.println("이름: "+member1.username+"\t"+"이메일: "+member1.email+"\t"+
		 * "비번: "+member1.password+"\t"+"전번: "+member1.phone+"\t"+"생년월일: "+member1.
		 * birth+ "\t"+"나이: "+member1.age);
		 */

//// 메소드로 출력하는 방법
		// member1.display();

//// toString으로 출력하는 방법
		System.out.println(member1);

////가변 매개 변수
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
	}

}
