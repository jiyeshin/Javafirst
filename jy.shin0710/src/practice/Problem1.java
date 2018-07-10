package practice;

public class Problem1 {

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				ar[i][j] = cnt;
				cnt++;
			}
		}
		for (int i = 0; i < 25; i++) {
			System.out.printf("%3d", ar[i / 5][i % 5]);
			if (i % 5 == 4)
				System.out.println();
		}

	}

}
