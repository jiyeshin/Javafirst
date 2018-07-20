package bytestream;

import java.util.*;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("num: ");
		int i=sc.nextInt();
		System.out.println(i);
		
		System.out.print("string: ");
		String str=sc.nextLine();
		System.out.println(str);
		
		
		/*
		 * BufferedReader r=new BufferedReader(new InputStreamReader(System.in());
		 * String __=r.readLine();
		 * 
		 */
		sc.close();

	}

}
