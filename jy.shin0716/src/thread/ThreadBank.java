package thread;

public class ThreadBank extends Thread {
	private Bank bank;
	private String name;

	public ThreadBank(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}

	public void run() {
		int i = 0;
		while (i < 3) {
			bank.job(name);
			i = i + 1;
		}
	}
}
