package abstracttest;

public class Android extends Smartphone{
	public void call() {
		System.out.println("안드로이드에서 전화걸기");
		
		//반올림 만들기 - 소수 첫째 자리
		double x=10.75;
		System.out.println("x: "+(int)(x+0.5));
		
		//반올림 만들기 - 소수 둘째 자리
		System.out.println("x: "+((int)(x*10+0.5))/10.0);
		
		
	}
}
