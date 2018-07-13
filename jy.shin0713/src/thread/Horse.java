package thread;

import java.util.Random;

public class Horse extends Thread {
	private static int rank; //이 클래스로부터 만들어진 모든 인스턴스가 공유
	
	public void run() {
		System.out.println(getName() + " 출발"); // 스레드 이름 출력
		int pos = 0; // 현재 위치를 저장할 변수
		Random r = new Random();

		while (true) {
			try {
				Thread.sleep(100);
				pos = pos + r.nextInt(10);
				if (pos > 1000) {
					break;
				}
				System.out.println(getName()+":"+pos);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		rank=rank+1;
		System.out.println(getName() + " 골인"); // 스레드 이름 출력
		System.out.println(getName() + rank +"등"); // 스레드 이름 출력
	}
}
