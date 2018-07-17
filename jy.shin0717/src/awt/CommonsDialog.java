package awt;

import java.awt.*;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		setBounds(200, 200, 600, 600);
		setTitle("Commons Dialog");

		FileDialog fileDialog=new FileDialog(this, "File Dialog"); //파일 대화상자 만들기
		fileDialog.setDirectory("C:\\Users\\503-12\\Documents"); //디렉토리 설정
		
		fileDialog.setVisible(true); //파일 대화상자 화면에 출력
		
		String filePath=fileDialog.getDirectory()+fileDialog.getFile(); //선택한 파일 경로 가져오기
		Label lb=new Label(filePath);
		add(lb);
		
		
		
		
		
		
		setVisible(true);

	}
}
