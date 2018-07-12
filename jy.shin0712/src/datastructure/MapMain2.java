package datastructure;

public class MapMain2 {

	public static void main(String[] args) {
		// 프로야구 팀별 선수 명단을 배열로 만들기
		String[] kia = { "윤석민", "안치홍", "김선빈" };
		String[] hanhwa = { "권혁   ", "정근우" };
		String[] lotte = { "레일리", "이대호" };
		String[] nc = { "박석민", "이재학" };
	
		
		// String 배열의 배열
		String[][] players = { kia, hanhwa, lotte,nc };

		// 배열의 데이터 출력
		// 큰 배열에 포함된 작은 배열의 데이터 개수만큼 반복
		for (int i = 0; i < players.length; i = i + 1) {
			if (i == 0) {
				System.out.print("기아: " + "\t");
			} else if (i == 1) {
				System.out.print("한화: " + "\t");
			}
			else if (i == 2) {
				System.out.print("롯데: " + "\t");
			}
			else if (i == 3) {
				System.out.print("엔씨: " + "\t");
			}

			String[] temp = players[i]; // 작은 배열을 순서대로 가져오기
			for (int j = 0; j < temp.length; j = j + 1) {// 작은 배열의 데이터 개수만큼 반복
				System.out.print(temp[j] + "\t");
			}
			System.out.println();
		}

	}

}
