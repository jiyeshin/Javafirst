package polymorphism;

public class Main {

	public static void main(String[] args) {
		/*// Super 클래스 인스턴스를 생성
		Super base =new Super();
		
		//Sub클래스의 인스턴스를 생성
		Sub drive=new Sub();
		
		//상위 클래스의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있음.
		Super ob1=new Sub();

		//하위 클래스 타입의 변수에 상위 클래스 타입의 인스턴스 주소를 대입하는 것은
		//강제 형 변환을 통해서만 가능
		//이 때, 문제 발생할 수 있음 - 예외가 발생
		Sub ob2=(Sub)(new Super());*/
		
		
		
	////다형성
		//상위 클래스 타입의 변수에 하위 클래스 타입의 주소를 대입할 수 있음
		//obj는 기본적으로 Super것만 호출 할 수 있음
		//오버라이딩 된 메소드는 변수를 선언할 때 사용한 자료형이 아니라, 
		//인스턴스를 만들어서 대입할 때 사용한 자료형의 것을 호출함
		
		Super obj=new Super();
		obj.display(); //Super것을 부름
		
		
		obj=new Sub();
		obj.display();//Sub것을 부름
		
		
	}

}


