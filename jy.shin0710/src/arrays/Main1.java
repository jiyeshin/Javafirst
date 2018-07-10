package arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		String []str= {"자바","오라클","웹 프론트 엔드","웹 백엔드","안드로이드","아이오에스"};
		int idx=Arrays.binarySearch(str, "오라클");
		System.out.println(idx);

				idx=Arrays.binarySearch(str, "아이오에스");
				System.out.println(idx);
	}

}
