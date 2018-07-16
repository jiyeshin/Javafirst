package frame;

import java.awt.*;

public class MyWindow extends Frame {
	public MyWindow() { // 생성자

		/*
		 * Dialog dialog = new Dialog(this); dialog.setTitle("헬로 다이얼로그");
		 * dialog.setSize(300, 300);
		 */

		this.setBackground(Color.BLUE);
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("헬로 윈도우");
		Panel panel = new Panel();

		Button button1 = new Button("btn1");
		// ColorThread th1 = new ColorThread(button1); // 버튼의 배경색 변경하는 스레드
		Thread th1 = new Thread() {
			public void run() {
				Color[] colors = { Color.blue, Color.green, Color.ORANGE };
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button1.setBackground(colors[idx % colors.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		};
		th1.start();
		panel.add(button1);

		Button button2 = new Button("btn2");
		// TextThread th2 = new TextThread(button2); // 버튼의 글씨를 변경하는 스레드
		Thread th2 = new Thread() {
			public void run() {
				String ar[] = { "A", "B", "C", "D" };
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button2.setLabel(ar[idx % ar.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		};
		th2.start();
		panel.add(button2);

		add(panel);

		setVisible(true);
	}
}
