package thread;

public class ThreadMain2 {

	public static void main(String[] args) {
		ThreadEx2 th1 = new ThreadEx2();
		th1.start();
		System.out.println("정말 스레드?");
	}

}
