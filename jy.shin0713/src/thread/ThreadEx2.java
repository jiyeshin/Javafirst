package thread;

import java.util.Random;

public class ThreadEx2 extends Thread {
	public void run() {
		//빨강 파랑 노랑을 랜덤하게 1초마다 출력
		String[]color= {"빨","파","노"};
		Random rd=new Random();
		
		while(true) {
			System.out.println(color[rd.nextInt(color.length)]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
