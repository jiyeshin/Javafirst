package wrapper;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1-45까지 정수를 6개 저장할 공간을 생성
		int[] lotto = new int[6];
		int size = lotto.length;
		// 인덱스 변수
		int i, j;
		// 데이터를 입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.print("1-45사이의 정수를 입력하시오");
				String temp = sc.nextLine();
				lotto[i] = Integer.parseInt(temp);
				if (!(lotto[i] >= 1 && lotto[i] <= 45)) {
					System.out.println("1-45사이의 정수를 다시 입력하시오.");
					i = i - 1;
					continue;
				}
				// 이전에 입력된 값들과 비교-중복검사
				for (j = 0; j < i - 1; j = j + 1) {
					// 이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					if (lotto[i] == lotto[j]) {
						break;
					}
				}
				// 이전 데이터와 방금 입력된 데이터가 동일하면
				if (j != i) {
					System.out.println("동일한 데이터는 안됩니다.");
					i = i - 1;
					continue;
				}

			} catch (Exception e) {
				System.out.println("숫자를 입력하시오.");
				i = i - 1;
			}
		}
		for (i = 0; i < size; i = i + 1) {
			System.out.printf("%d\t", lotto[i]);
		}
		sc.close();
	}

}