package thread;

public class ThreadEx2runnable implements Runnable {

	@Override
	public void run() {
		int i=0;
		while(i<10) {
			System.out.println("Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i=i+1;
			
		}

	}

}
