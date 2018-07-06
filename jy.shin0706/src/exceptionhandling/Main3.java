package exceptionhandling;

public class Main3 {

	public static void main(String[] args) {
		// java.lang.thread라는 클래스에는 sleep이라는 메소드가 있는데, 이 메소드는 매개변수로 대입된 시간만큼
		// 실행을 중지시키는 역할을 함
		// 이 메소드를 이용해서 1-10까지를 1초씩 쉬면서 출력

		/*for (int i = 1; i < 11; i = i + 1) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		int idx = 0;
		for (;;) {
			System.out.println("image" + (idx % 3) + ".png");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			idx = idx + 1;
		}*/
		
//김기태, 이종범, 최향남, 이대진을 번갈아 가면서 출력
		String []name= {"김기태", "이종범", "최향남", "이대진"};
		int size=name.length;
		int i=0;
		while(true) {
			System.out.println(name[i%size]);
			i=i+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
