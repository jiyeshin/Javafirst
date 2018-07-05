package interfacetest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//인터페이스로도 변수를 만들 수 있고
		//인터페이스로 만든 변수는 자신을 implements한 클래스의 인스턴스의 주소를 저장할 수 있음.
		//그래서 LoginServiceImpl loginService = new LoginServiceImpl();로 할 수도 있지만 아래처럼도 가능
		LoginService loginService = new LoginServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디: ");
		String id=sc.nextLine();
		
		boolean r=loginService.idCheck(id);
		if(r==true) {
			System.out.println("사용가능한 아이디 입니다.");
		}
		else {
			System.out.println("이미 존재하는 아이디 입니다.");
		}
		
		
		System.out.print("로그인할 아이디: ");
		id=sc.nextLine();
		
		System.out.print("비밀번호: ");
		String password=sc.nextLine();
		
		int result=loginService.login(id, password);
		if(result==0) {
			System.out.println("로그인 성공");
		}
		else if(result==1) {
			System.out.println("비밀번호가 틀림");
		}
		else if(result==2) {
			System.out.println("없는 아이디");
		}
		sc.close();
	}

}
