package awt;


import java.awt.*;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		setBounds(200, 200, 800, 800);
		setTitle("Layout Test");

		Panel panel = new Panel();
		/*panel.setLayout(new BorderLayout()); // panel의 레이아웃을 설정

		// 컴포넌트 배치
		for (int i = 0; i < 10; i = i + 1) {
			Button btn = new Button("button" + i);
			panel.add(btn);
		}
		setResizable(false);*/
		
		panel.setLayout(new BorderLayout());
		
		Button btnEast=new Button("E");
		panel.add("East",btnEast);
		Button btnSouth=new Button("S");
		panel.add("South",btnSouth);
		Button btnCenter=new Button("Ct");
		panel.add("Center",btnCenter);
		
		
		
		
		add(panel);

		setVisible(true);

	}
}
