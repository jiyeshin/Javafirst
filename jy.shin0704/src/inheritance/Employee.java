package inheritance;
//종업원 정보를 저장하기 위한 클래스

public class Employee {
//번호와 이름을 저장하기 위한 변수 
	//상속받은 곳에서 사용할 수 있도록 private를 protected로 바꿔줌
	protected int num;
	protected String name;
	
//num의 값을 일련번호로 만들기 위한 공유 변수-static변수
	protected static int autoincrement; //<- 초기값은 0, 아래에서 1증가하는 값이 저장됨. static이 붙었기 때문. 
												//static 안 붙은 것들은 할 때마다 초기화됨.
	
//생성자(constructor)
	//
	public Employee(int n) {
		//일련번호 만들기
		autoincrement=autoincrement+1;
		num=autoincrement;
	}
	
	
//인스턴스 변수를 사용할 수 있도록 하기 위한 접근자 메소드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//값을 확인하기 쉽게 하기 위한 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name= " + name + "]";
	}

	

	
	
	
}
