package datastructure;

import java.util.*;

public class ListMain2 {

	public static void main(String[] args) {
		// 정수를 저장하는 ArrayList와 LinkedList를 만들고 
		//중간에 데이터 10만개를 삽입하는데 걸리는 시간을 측정
		ArrayList<Integer>al=new ArrayList<>();
		LinkedList<Integer>ll=new LinkedList<>();
		
		al.add(1);
		al.add(3);
		al.add(4);
		
		ll.add(1);
		ll.add(3);
		ll.add(4);
		
		long start=System.currentTimeMillis();
		for(int i=0;i<100000;i=i+1) {
			al.add(1,2); //1번째 자리에 2를 추가
		}
		long end=System.currentTimeMillis();
		System.out.println("al: "+(end-start));
		
		
		long start1=System.currentTimeMillis();
		for(int i=0;i<100000;i=i+1) {
			ll.add(1, 2);
		}
		long end1=System.currentTimeMillis();
		System.out.println("ll: "+(end1-start1));
		
		
		//읽는 시간
		start=System.currentTimeMillis();
		for(int i=0;i<100000;i=i+1) {
			al.get(i); 
		}
		end=System.currentTimeMillis();
		System.out.println("al: "+(end-start));
		
		
		start=System.currentTimeMillis();
		for(int i=0;i<100000;i=i+1) {
			ll.get(i);
		}
		end=System.currentTimeMillis();
		System.out.println("ll: "+(end-start));
		
		
		
		
		
	}
}
