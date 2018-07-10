package homework;

public class Main2 {

	public static void main(String[] args) {
		int i, j;
		//// 모래시계형
		for (i = 0; i < 5; i = i + 1) {
			if (i < 3) {
				for (j = 0; j < 3 - i; j = j + 1) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (j = 0; j <= i - 2; j = j + 1) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println();

		//// 4번 삼각형
		for (i = 0; i < 9; i = i + 1) {
			for (j = 0; j < 9 - i * 2; j = j + 1) {
				System.out.print("*");

			}
			System.out.println();
		}

//// 빈 삼각형
		int k=0;
		for(i=0;i<7-i;i=i+1) {
			System.out.print(" ");
		}
		
		System.out.print(k);
		for(i=0;i<7;i=i+1) {
			System.out.print(" ");
		}
		System.out.print(k+1);
		
		for(i=0;i<7-i;i=i+1) {
			System.out.print(" ");
		}
		
	}

}
