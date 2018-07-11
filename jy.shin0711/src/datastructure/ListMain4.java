package datastructure;

import java.util.*;

public class ListMain4 {

	public static void main(String[] args) {

		ArrayList<Jbj> list = new ArrayList();
		Jbj jbj = new Jbj();
		jbj.setName("켄타");
		jbj.setAge(24);
		list.add(jbj);

		jbj = new Jbj();
		jbj.setName("김상균");
		jbj.setAge(24);
		list.add(jbj);

		jbj = new Jbj();
		jbj.setName("노태현");
		jbj.setAge(26);
		list.add(jbj);

		jbj = new Jbj();
		jbj.setName("권현빈");
		jbj.setAge(22);
		list.add(jbj);

		Comparator<Jbj> comp=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Jbj first=(Jbj)o1;
				Jbj second=(Jbj)o2;
				
				return first.getAge()-second.getAge(); //메인에서 인스턴스 만들어서 하는 경우
			//return first.getName().
			}	
		};
		list.sort(comp);
		
		// 리스트의 모든 데이터 확인
		System.out.println(list);

		// 각각의 데이터 확인
		for (Jbj temp : list) {
			System.out.println(temp);
		}

	}

}
