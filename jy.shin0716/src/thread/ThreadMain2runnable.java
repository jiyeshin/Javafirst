package thread;

public class ThreadMain2runnable {

	public static void main(String[] args) {
		ThreadEx2runnable obj=new ThreadEx2runnable();
		Thread th2=new Thread(obj);
		th2.start();

	}

}
