package awt;

import java.awt.*;

public class CommonsDialog2 extends Frame {
	// 생성자 - 인스턴스를 생성할 떄 호출하는 메소드
	public CommonsDialog2() {
		setBounds(300, 300, 800, 800);
		setTitle("Commons DIalog2");
		
		//FileDialog객체를 생성해서 화면에 출력하고 
		//선택한 파일 경로를 레이블에 출력
		//FileDialog를 생성할 때 첫 번째 매개변수가 Dialog나 Frame의 주소인데
		//지금의 경우는 this를 대입하면 됨.
		
		FileDialog fdialog=new FileDialog(this, "FILE DIALOG");
		fdialog.setDirectory("C:\\Users\\503-12\\Documents\\jiyeshin\\학습자료\\java 박문석 선생님\\java");
		fdialog.setVisible(true);
		
		String fpath=fdialog.getDirectory()+fdialog.getFile();
		Label label=new Label(fpath);
		add(label);
		
		
		
		setVisible(true);
	}
}
