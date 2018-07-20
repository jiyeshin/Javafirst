package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		BufferedInputStream bis=null;
		try {
			bis=new BufferedInputStream(new FileInputStream("C:\\Users\\503-12\\Documents\\jiyeshin\\필기노트\\필기노트_180702.txt"));
			while(true) {
				byte[]b=new byte[300];
				int r=bis.read(b);
				/*for(byte temp:b) {
					System.out.println(temp);
				}*/
				System.out.println(new String(b));
				if(r<=0)break;
			}
		}catch(Exception e) {
			System.out.println("Exception for File Input" + e.getMessage());
		}finally {
			
		}

	}

}
