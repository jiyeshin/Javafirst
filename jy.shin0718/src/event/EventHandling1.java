package event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventHandling1 extends Frame {
	// 생성자
	public EventHandling1() {
		setBounds(1300, 700, 550, 800);
		setTitle("Event Handling Test");
		Panel panel = new Panel(); //여러 개를 배치하기 위해서 패널 생성
		Panel panelSouth = new Panel(); //여러 개를 배치하기 위해서 패널 생성
		

		TextField tf1=new TextField(10);
		panel.add(tf1);
		Label plus=new Label(" + ");
		panel.add(plus);
		TextField tf2=new TextField(10);
		panel.add(tf2);
		Label assign=new Label(" = ");
		panel.add(assign);
		TextField result=new TextField(10);
		panel.add(result);
		
		
		
		
		Button btnResult = new Button("Result");
		btnResult.setFont(new Font("바탕",20,40));
		ActionListener actionResult=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n1=tf1.getText();
				String n2=tf2.getText();
				int r=Integer.parseInt(n1)+Integer.parseInt(n2);
				result.setText(r+"");
			}
		};
		btnResult.addActionListener(actionResult);
		panel.add(btnResult);
		
		
		Button btnExit = new Button("Exit");
		btnExit.setFont(new Font("바탕",20,40));
		ActionListener actionExit = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		btnExit.addActionListener(actionExit);
		panelSouth.add(btnExit);

		
		
		
		Label lbPw=new Label("P/W");
		panel.add(lbPw);
		TextField pw=new TextField(15);
		panel.add(pw);
		Label pwResult=new Label();
		panel.add(pwResult);
		
		//텍스트 필드의 내용이 변경될 때 처리할 수 있는 인터페이스의 인스턴스를 생성
		TextListener textListener=new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				String password=pw.getText();
				
				int dae=0;
				int so=0;
				int num=0;
				int etc=0;
				
				for(int i=0;i<password.length();i=i+1) {//password의 모든 글자를 순회
					char ch=password.charAt(i);
					if(ch>='A'&&ch<='Z') {
						dae=dae+1;
					}
					else if(ch>='a'&&ch<='z') {
						so=so+1;
					}
					
					else if(ch>='0'&&ch<='9') {
						num=num+1;
					}
					else {
						etc=etc+1;
					}
				}
				if(dae*so*num*etc>0) {
					pwResult.setBackground(Color.YELLOW);
					pwResult.setText("O");
				}
				else {
					pwResult.setBackground(Color.RED);
					pwResult.setText("X");
				}
			
			}
			
		};
		
		pw.addTextListener(textListener);
		
		add("South",panelSouth);
		add(panel);
		setVisible(true);
	}
}
