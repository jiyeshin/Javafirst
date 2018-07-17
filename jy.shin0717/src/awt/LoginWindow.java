package awt;

import java.awt.*;

public class LoginWindow extends Frame {
	
	public LoginWindow() { // 생성자: 인스턴스를 만들 떄 호출하는 메소드
		setSize(500, 500);
		setLocation(200, 200);
		setTitle("LOGIN");

		Panel panel=new Panel(); //1. 패널생성
		Label label=new Label("ID");
		TextField txtId=new TextField(20);
		panel.add(label);
		panel.add(txtId);
		
		Label lbPw=new Label("P/W");
		TextField txtPw=new TextField(20);
		txtPw.setEchoChar((char)97);
		panel.add(lbPw);
		panel.add(txtPw);
		
		
		TextArea txtAr=new TextArea(10,50);
		panel.add(txtAr);
		
		
		MenuBar menuBar=new MenuBar(); //메뉴 바 만들기
		Menu file=new Menu("file(F)"); //메뉴 생성
		menuBar.add(file); //메뉴를 메뉴 바에 부착
		
		MenuItem newFile=new MenuItem("new");
		file.add(newFile);
		MenuItem save=new MenuItem("save");
		file.add(save);
		
		Menu edit=new Menu("edit(E)");
		menuBar.add(edit);
		MenuItem copy=new MenuItem("copy");
		edit.add(copy);
		MenuItem paste=new MenuItem("paste");
		edit.add(paste);
		MenuItem delete=new MenuItem("delete");
		edit.add(delete);
		
		Menu help=new Menu("help(H)");
		menuBar.add(help);
		
		
		
		
		
		
		setMenuBar(menuBar); //메뉴 바를 윈도우에 배치
		add(panel);//2. 패널을 프레임에 부착
		
		setVisible(true);// 화면 출력
	}
}
