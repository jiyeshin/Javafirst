package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {
	public EventWindow() {
		// 윈도우의 시작 좌표, 크기, 제목 설정
		setBounds(1200, 800, 800, 800);
		setTitle("Event Test");

		Button btn1 = new Button("button 1");
		Panel panel = new Panel();
		panel.add(btn1);

		add(panel);
		setVisible(true);

		// 버튼을 누를 때 이벤트 처리: ActionListener인터페이스
		ActionListener action1 = new ActionListener() {

			@Override
			// 버튼이 눌러지면 호출되는 메소드
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 종료
			}
		};
		// 버튼과 리스너 연결
		// btn1에 ActionEvent가 발생하면 action1의 메소드를 호출하도록 설정
		btn1.addActionListener(action1);
	}
}
