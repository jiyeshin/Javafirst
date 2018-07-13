package thread;

public class ThreadMain4 {

	public static void main(String[] args) {
		ThreadEx4 obj1=new ThreadEx4("스레드 1");
		ThreadEx4 obj2=new ThreadEx4("스레드 2");
		
		Thread th1=new Thread(obj1);
		Thread th2=new Thread(obj2);
		
//스레드의 우선순위 변경
		th1.setPriority(Thread.MIN_PRIORITY); // 가장 낮은 우선 순위로 설정
		th2.setPriority(Thread.MAX_PRIORITY); // 가장 높은 우선 순위로 설정
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(3000);
			th1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
