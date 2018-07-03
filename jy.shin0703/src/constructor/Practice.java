package constructor;

public class Practice {
	

	
////생성자 오버로딩: 동일한 이름의 메소드가 2개 이상 있는 경우
	public Practice() {
		name="noname";
	}
	public Practice(String arg) {
		name=arg;
	}
	
	
////게터세터	
	private String name; //이름을 저장하기 위한 인스턴스 변수를 선언

	//private인 변수 name의 접근자 메소드- 게터 세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
////생성자를 이용하지 않는 초기화
	static {
		System.out.println("맨 처음 한번만 수행되는 내용");
	}
	
	{
		System.out.println("인스턴스를 만들 때마다 수행되는 내용");
		//main에서 Practice practice1=new Practice(); 한번 나올 때마다 수행됨.
	}

	
////this 연습
	public void display() {
		String name="지역변수 name";
		//this.을 붙이면 지역변수에서는 찾지 않고 인스턴스 변수에서 찾아옴.
		System.out.println(this.name); //this.붙이기 전에는 "지역변수 name"이 출력되지만, this.붙인 후에는 park가 나옴
	}
	
	

}
