package thread;

public class ThreadAccount2 extends Thread {
	private Account account; //Account account=new Account();

	public ThreadAccount2(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 5; i = i + 1) {
			account.withdraw();
		}
	}
}
