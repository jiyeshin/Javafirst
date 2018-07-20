package bytestream;

import java.io.*;

public class PrintStreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;

		try {
			ps = new PrintStream(new FileOutputStream("./data.dat",true));
			ps.println("feel so good");
			ps.println("hungry");
			ps.flush();
		} catch (Exception e) {
			System.out.println("Exception for Print" + e.getMessage());
		} finally {
			if (ps != null)
				ps.close();
		}

	}

}
