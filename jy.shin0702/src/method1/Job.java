package method1;

public class Job {

	public static void display(){
		System.out.println("static 메소드");
	}
	
	
	//call by value : 매개변수가 value형인 경우. 원본 데이터 변경 못함 
	public static void incValue(int n) {
		n=n+1;
	}
	
	
	//call by reference : 매개변수가 참조형인 경우. 원본 데이터 변경 가능 
	public static void incReference(int [] n) {
		n[0]=n[0]+1;
	}
	
	//재귀함수 만들기
	//if(중단조건) return 중단 했을 때의 값, 
	//else 재귀함수를 호출
	
	//1부터 n까지의 합을 재귀를 이용해서 리턴해주는 함수
	public int sum(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+sum(n-1);
		}
	}
	
	//피보나치 수열
	public int pivotNoRecursion(int n) {
		int n1=1;
		int n2=1;
		int result =1;
		for(int i=3;i<n+1;i++) {
			result =n1+n2;
			n1=n2;
			n2=result;
		}
		return result;
	}
	
	
	public int pivotRecursion(int n) {
		if(n==1||n==2) {
			return 1;
		}
		else {
			return pivotRecursion(n-1)+pivotRecursion(n-2);
		}
	}


}
