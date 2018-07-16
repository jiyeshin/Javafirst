package thread;

public class Bank {
	// 잔액을 저장할 변수
	private int balance = 1000;

	// 잔액을 변경하는 메소드
	public void job(String msg) {
		synchronized (this) {
			// this- 내 자신의 자원을 사용하는 경우 이코드는 한번에 수행되도록 설정
			System.out.println(msg + "현재 잔액: " + balance);
			balance = balance - 100;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + "작업 후 현재 잔액: " + balance);
		}
	}
}