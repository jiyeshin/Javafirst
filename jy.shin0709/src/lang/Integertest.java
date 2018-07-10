package lang;

import java.util.Scanner;

public class Integertest {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int x = -1; while (true) {
		 * System.out.print("정수 입력: "); String temp = sc.nextLine(); // 입력 받을 때 되도록이면
		 * String으로 받고, 후에 변환해주는게 좋다 try { x = Integer.parseInt(temp); break; }
		 * 
		 * catch (Exception e) { System.out.println("정수를 입력하시오."); } } ;
		 * 
		 * System.out.println(x); sc.close();
		 */
		// 데이터를 저장할 배열 생성
		int[] lotto = new int[6];
		int size = lotto.length;

		// 배열의 모든 데이터 출력
		int i;
		Scanner scn = new Scanner(System.in);
		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.println("1-45 사이의 정수 입력");
				String temp = scn.nextLine();
				lotto[i] = Integer.parseInt(temp);
				if (lotto[i] < 1 || lotto[i] > 45) {// !(lotto[i]>=1&&lotto[i]<=45)
					System.out.println("다시 입력하시오");
					i = i - 1;
					continue;
				}
			}

			catch (Exception e) {
				System.out.println("정수를 입력하시오.");
				i = i - 1;
			}
			scn.close();
		}
			for (i = 0; i < size; i = i + 1) {
				System.out.println(lotto[i]);
			}

			
		}
	}


