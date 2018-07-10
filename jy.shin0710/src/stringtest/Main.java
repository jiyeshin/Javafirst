package stringtest;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int x=200;
		int y=100;
		String msg = "I like Java";
		
		
		
		//x:200 y:100 형식의 문자열 만들기
		String str=String.format("x:%d y:%d", x,y); //format메소드는 static이므로 String.format의 형태로 사용함.
		//static이 안붙은 메소드는 msg.trim()요런식으로 씀
		System.out.println(str);
		
		//msg 문자열에서 java포함여부 확인 - 대소문자 구분 없이
		int idx=msg.toLowerCase().indexOf("java".toLowerCase()); //포함 안된 문자열 찾으면 -1이 나옴
		System.out.println(idx);
		if(idx>=0) {
			System.out.println("java가 존재함");
		}else {
			System.out.println("java가 존재하지 않음");
		}
		
		//msg 문자열을 공백 기준으로 분할해서 하나씩 출력
		String [] ar=msg.split(" ");
		for(int i=0; i<ar.length;i=i+1) {
			System.out.println(ar[i]);
		}
		
		//msg 문자열의 3 번째부터 7 번째 글자까지 출력
		String sub=msg.substring(3,8); //마지막은 한 칸 더 큰 값을 넣는게 중요
		System.out.println(sub);
		
		//generics 
		 ArrayList<String>al=new ArrayList<>();
		HashMap<String, String>hm=new HashMap<>();

		
		
	}

}
