package random;

import java.util.StringTokenizer;

public class StringTokenmain {

	public static void main(String[] args) {
		String msg="난 혼자인게 편했는데 너를 만난 후에 변한게 수도 없이 많지. 고장났던 내비, 길을 잃은 삶에서 나가지못한 장애물을 깼지.";
		String data="90,30,80,50";
		
		//msg를 공백 단위로 분할해서 출력
		//1. split 메소드 이용
		String[]ar=msg.split(" ");
		for(String spl:ar) {
			System.out.println(spl);
		}
		System.out.println("===================");
		//StringToken 메소드 이용
		StringTokenizer st = new StringTokenizer(msg," ");
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		//data를 ,단위로 분할해서 합계를 구하기
		String []ar1=data.split(","); //뭔가 안되면 \\붙여보기
		for(String spl1:ar1) {
			System.out.println(spl1);
		}
		int sum=0;
		for(String ar11:ar1) {
			//잘라진 토큰을 정수로 변환해서 더하기
		sum=sum+Integer.parseInt(ar11);
		}
		System.out.println("합계: "+sum);
	}

}
