package interfacetest;

import java.io.Serializable;

//LoginService인터페이스를 implements한 클래스를 생성
//하나의 잉ㄴ터페이스를 implements한 클래스의 이름은 인터페이스 이름 뒤에 Impl을 붙이는 것이 관례
public class LoginServiceImpl implements LoginService, Serializable {

	@Override
	public boolean idCheck(String id) {
		boolean result = false;
		if (id.equals("root") == false) {
			result = true; // id가 root가 아니면 true
		}
		return result;
	}

	@Override
	public int login(String id, String password) {
		int result = 2;
		if (id.equals("root")) {
			if (password.equals("1234")) {
				result = 0;
			} 
			else {
				result = 1;
			}

		
		}
		return result;
	}
}
