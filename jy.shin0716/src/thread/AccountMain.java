package thread;

public class AccountMain {

	public static void main(String[] args) {
		Account account=new Account();
		
		ThreadAccount th1=new ThreadAccount(account);
		th1.start();
		ThreadAccount2 th2=new ThreadAccount2(account);
		th2.start();

	}

}
