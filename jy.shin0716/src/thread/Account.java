package thread;

public class Account {
	private int balance;

	public synchronized void deposit() {
		System.out.println("현재 잔액: " + balance);
		balance = balance + 1000;
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("작업 후 잔액: " + balance);

	}
	public synchronized void withdraw() {
		if(balance<1000) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("출금 전  잔액: " + balance);
		balance = balance - 1000;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("출금 후 잔액: " + balance);

	}
}
