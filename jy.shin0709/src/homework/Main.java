package homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 금액을 입력 받아서 오만원,만원 짜리를 몇장 주어야 하는지 계산
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오(만원 단위)");
		String temp = sc.nextLine();
		int money = Integer.parseInt(temp);

		int five = money / 50000;
		int one = (money % 50000) / 10000;
		System.out.println("5만원권: " + five + "장");
		System.out.println("1만원권: " + one + "장");

		sc.close();

		
		
		// 문자열을 입력받아서 모두 소문자로 변환. 공백은 제거
		/*String str = sc.nextLine();
		int size = str.length();
		String result="";
		char ch;
		for (int i = 0; i < size; i = i + 1) {
			if(ch>='A'&&ch<='Z') {
				ch=(char) ((char)ch+32);
			}
			result=ch;
		}
		System.out.println(ch);*/
	}
}
