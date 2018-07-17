package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		setBounds(1300, 800, 800, 800);
		setTitle("Event Routing");

		Button btn1 = new Button("111");
		Button btn2 = new Button("222");
		Button btn3 = new Button("333");

		Label label = new Label();
		Panel panel = new Panel();
		
		btn1.setFont(new Font("돋움", 20, 50));
		btn2.setFont(new Font("돋움", 20, 50));
		btn3.setFont(new Font("돋움", 20, 50));
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);

		add("North", panel);
		add("Center", label);

		//// 액션리스너
		/*
		 * ActionListener action1=new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * label.setText("Hello"); } };
		 * 
		 * ActionListener action2=new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { System.exit(0); } };
		 * 
		 * btn1.addActionListener(action1); btn2.addActionListener(action2);
		 */

		//// 이벤트라우팅
		ActionListener action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				switch (e.getActionCommand()) {
				case "111":
					label.setText("Hello");
					label.setFont(new Font("돋움",20,100));
					break;
				case "222":
					label.setText("Hello Hello");
					label.setFont(new Font("돋움",20,100));
					break;
				case "333":
					System.exit(0);
					break;
				}
			}
		};
		btn1.addActionListener(action);
		btn2.addActionListener(action);
		btn3.addActionListener(action);

		setVisible(true);
	}
}
