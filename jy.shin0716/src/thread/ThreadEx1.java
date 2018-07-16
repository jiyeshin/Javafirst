package thread;

public class ThreadEx1 extends Thread {

	// 1초마다 Thread라는 글자를 10번 출력
	public void run() {
		int i = 0;
		while (i < 10) {
			System.out.println("Thread");
			try {
				Thread.sleep(1000); //ThreadEx1.sleep(1000); 도 같음
			} catch (InterruptedException e) {
				System.out.println("스레드 종료"); 
				//스레드를 강제 종료 할 수 있도록 예외가 발생하면 run메소드 종료
				return; //실무에서는 항상 리턴이 들어가야 함. 
				
			}
			i = i + 1;
		}

	}
}
