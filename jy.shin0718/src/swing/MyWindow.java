package swing;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class MyWindow extends JFrame {
	public MyWindow() {
		setBounds(900, 700, 1000, 1000);
		setTitle("Window for Swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JLabel label = new JLabel();

		// label.setFont(new Font("바탕",50,50));
		label.setToolTipText("Hello");
		TitledBorder border = new TitledBorder("Line");
		label.setBorder(border);
		panel.add(label);

		JButton btn=new JButton("button");
		panel.add(btn);
		
		
		add(panel);
		setVisible(true);

		String[] images = { "0.png", "1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png" };
		ArrayList<String> list = new ArrayList<>(); // ArrayList는 크기 변경 가능
		list.add("0.png");
		list.add("1.png");
		list.add("2.png");
		list.add("3.png");
		list.add("4.png");

		Thread th = new Thread() {
			public void run() {
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(300);
						ImageIcon icon = new ImageIcon("C:\\Users\\503-12\\Downloads\\" + images[idx % images.length]);
						//리스트는 list.get(idx%list.size())
						
						label.setIcon(icon);
						idx = idx + 1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
		};
		th.start();
	}
}
