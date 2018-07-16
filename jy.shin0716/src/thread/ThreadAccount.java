package thread;

public class ThreadAccount extends Thread {
	private Account account; //Account account=new Account();

	public ThreadAccount(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 5; i = i + 1) {
			account.deposit();
		}
	}
}
