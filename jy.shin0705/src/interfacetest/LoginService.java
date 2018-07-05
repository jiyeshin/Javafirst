package interfacetest;


//메소드의 원형과 final변수만을 가지는 개체
//여기에 선언문을 만들고 이 인터페이스를 implements해서 클래스에서 실제 내용을 구현

public interface LoginService {
//인터페이스의 메소드는 abstract를 붙이지 않아도 추상 메소드임
//여기에 만드는 메소드는 내용({})을 가지면 안됨.
	
	//아이지 중복 체크를 위한 메소드
	public boolean idCheck(String id);
	
	//로그인 처리를 위한 메소드
	public int login(String id, String password);
	
	
}
