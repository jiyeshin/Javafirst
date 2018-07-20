package bytestream;

import java.io.*;

public class FileWriterMain {

	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("./char.txt", true);
			fw.write("Hadaka no Diva ");
			fw.write("Event Surundatte ");
			fw.write("What a surprise ");
			fw.flush();
		} catch (Exception e) {
			System.out.println("Exception for File Writer" + e.getMessage());
		} finally {
			if (fw != null)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
