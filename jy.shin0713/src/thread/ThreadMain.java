package thread;

public class ThreadMain {

	public static void main(String[] args) {
		// 앞에서 만든 클래스의 인스턴스를 만들고 run 메소드를 호출
	/*	ThreadEx1 th1 = new ThreadEx1();
		th1.run();
		ThreadEx1 th2 = new ThreadEx1();
		th2.run();*/
		
		//1초 sleep시키는 사이에 다른 작업 함. 
		ThreadEx1 th1=new ThreadEx1();
		th1.start();
		ThreadEx1 th2=new ThreadEx1();
		th2.start();
		
	}

}
