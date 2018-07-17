package awt;

import java.awt.Frame;
import java.util.Random;
import java.awt.*;

public class LayoutFrame2 extends Frame {
	public LayoutFrame2() {
		setBounds(200, 200, 800, 800);
		setTitle("Layout Test");
		Panel panel = new Panel();

		/*
		 * panel.setLayout(new GridLayout(2, 3, 10, 10)); for (int i = 0; i < 6; i = i +
		 * 1) { Button btn = new Button("button " + i); panel.add(btn); }
		 */

		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10, 50, 30, 50);
		add(label);

		add(panel);
		setVisible(true);

		Thread thread = new Thread() {
			public void run() {
				while (true) {
					int sign = 50;

					int x = label.getLocation().x;
					int y = label.getLocation().y;
					//label.setLocation(x + sign, y);
					Random r= new Random();
					label.setLocation(r.nextInt(300),r.nextInt(400));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		};
		thread.start();
	}
}
