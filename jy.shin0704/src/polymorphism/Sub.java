package polymorphism;

public class Sub extends Super{
//Super의 display메소드를 오버라이딩
	//@override쳐서 에러가 발생하지 않으면 제대로 오버라이딩 한 것.
	@override //상위 클래스에서 있는 메소드를 하위클래스에서 다시 만드는거.
	public void display() {
		System.out.println("How are you?");
	}
	
	public void method() {
		System.out.println("하위 클래스에 만든 메소드");
	}
}
