package file;

import java.io.File;
import java.sql.Date;

public class FileMain {

	public static void main(String[] args) {
		//파일에 대한 정보를 확인할 수 있는 클래스의 인스턴스를 생성
		File f=new File("C:\\Users\\503-12\\Documents\\jiyeshin\\학습자료\\자바_C 박성효 선생님\\한빛자바\\JavaProgramming.zip");
		
		//파일의 존재 여부
		System.out.println(f.exists());
		
		//파일의 크기
		long size=f.length();
		System.out.println(size/1024/1024+"M");
		
		//파일 최후 수정 날짜
		Date date=new Date(f.lastModified());
		System.out.println(date);
		
		File file=new File("C:\\User\\503-12\\Documents\\jiyeshin\\학습자료\\practice.txt");
		String parent=file.getParent();
		String filename=file.getName();
		//특정 문자의 위치를 찾아서 그 문자 이후의 문자열을 가져오기
		//찾고자 하는 데이터가 없으면 음수를 리턴. 있으면 위치를 리턴
		int idx=filename.indexOf('t');
		System.out.println(idx);
		
		if(idx>=0) {
			//문자열을 위치로 자르는 메소드는 substring임
			//기호로 자르는 것은 split
			filename=filename.substring(idx+1);
		}
		System.out.println(filename);

		file.renameTo(new File(filename));
		
		
		
		
		
		
		
	}

}
