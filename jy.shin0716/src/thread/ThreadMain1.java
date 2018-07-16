package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		ThreadEx1 th=new ThreadEx1();
		th.setDaemon(true); //다른 스레드가 작업중이 아니면 자동 종료
		th.start();
		
		try {
			Thread.sleep(2000);
			th.interrupt(); //종료시키는게 아니라 InterruptedException을 발생시킴
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 종료");
		//System.exit(0); //프로그램 종료

	}

}
