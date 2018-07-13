package thread;

public class ThreadMain3 {

	public static void main(String[] args) {
		// Runnable 인터페이스를 implements한 클래스를 이용해서 스레드 시작
		ThreadEx3 obj=new ThreadEx3();
		Thread th=new Thread(obj);
		th.start(); //start 메소드는 thread 클래스에 포함된거라 꼭 thread 인스턴스 만들어야 쓸 수 있음

	}

}
