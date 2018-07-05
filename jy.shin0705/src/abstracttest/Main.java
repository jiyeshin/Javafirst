package abstracttest;

public class Main {

	public static void main(String[] args) {
		Smartphone smartphone=new Iphone();
		smartphone.call();
		
		System.out.println();
		
		smartphone = new Android();
		smartphone.call();
		
//Smartphone의 인스턴스 생성
		//smartphone=new Smartphone();
		smartphone=new WinPhone();
		smartphone.call();
		
////final 변수
		//값을 변경 못함
		//지역변수지만 전역면수처럼 메모미렝서 소멸되지 않음.
		
		final int ZERO=0;
		
		
	}

}
