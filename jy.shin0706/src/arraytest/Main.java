package arraytest;

public class Main {

	public static void main(String[] args) {
		int ar []= {10,30,70,40,15};
		int max=ar[0];
		int idx=0;
		int size=ar.length;
		int i;
		
		
		for(i=1;i<size;i=i+1) {
			if(max<ar[i]) {
				max=ar[i];
				idx=i;
			}
		}
		System.out.println("가장 큰 수 위치: "+idx);
	}

	}


