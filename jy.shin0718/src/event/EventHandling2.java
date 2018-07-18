package event;

import java.awt.*;
import java.awt.event.*;

public class EventHandling2 extends Frame {
	public EventHandling2() {
		setBounds(1000, 700, 600, 600);
		setTitle("Keybord Event");
		setLayout(null);
		Label air = new Label("&");
		air.setFont(new Font("바탕", 50, 30));
		air.setBounds(10, 60, 30, 30);
		add(air);
		KeyListener keyListener = new KeyListener() {

			@Override // 문자키를 눌렀을 때 호출되는 메소드
			public void keyTyped(KeyEvent e) {

			}

			@Override // 키보드를 눌렀을 때
			public void keyPressed(KeyEvent e) {
				int x = air.getLocation().x;
				int y = air.getLocation().y;
				if (e.getKeyCode() == e.VK_LEFT) {
					x = x - 10;
				}
				if (e.getKeyCode() == e.VK_RIGHT) {
					x = x + 10;
				}
				if (e.getKeyCode() == e.VK_UP) {
					y = y - 10;
				}
				if (e.getKeyCode() == e.VK_DOWN) {
					y = y + 10;
				}

				air.setLocation(x, y);
				
				// Modifiers는 같이 누른 조합키 값을 리턴
				if (e.getModifiers() == KeyEvent.ALT_MASK && e.getKeyCode() == KeyEvent.VK_E)
					System.exit(0);

				// Thread안에 넣어도 됨.
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					Label la = new Label("shot");
					la.setBounds(air.getLocation().x, air.getLocation().y - 50, 60, 60);
					add(la);

					Thread th = new Thread() {
						public void run() {
							try {
								while (true) {
									Thread.sleep(1000);
									int x = la.getLocation().x;
									int y = la.getLocation().y;
									la.setLocation(x, y - 10);
									if (y < 50)
										break;
								}
								la.setVisible(false);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					};
					th.start();
				}
			}

			@Override // 키보드에서 손을 뗄 때
			public void keyReleased(KeyEvent e) {
			}
		};
		addKeyListener(keyListener); //Frame에 키보드 이벤트 연결
		

		
		
		WindowAdapter windowListener = new WindowAdapter() {
			@Override //종료 버튼 누를 때 호출되는 메소드
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		
		addWindowListener(windowListener);
		setVisible(true);
	}
}
