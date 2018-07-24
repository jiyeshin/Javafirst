package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DTOMain {

	public static void main(String[] args) throws IOException {
		ArrayList<DTO>list=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i=i+1) {
			DTO dto=new DTO();
			System.out.print("번호: ");
			dto.setNum(sc.nextInt());
			sc.nextLine();
			System.out.print("이름: ");
			dto.setName(sc.nextLine());
			System.out.print("점수: ");
			dto.setJumsu(sc.nextInt());
			list.add(dto);
		}
		Comparator<DTO>comp=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				DTO first=(DTO)o1;
				DTO second=(DTO)o2;
				
				return first.getJumsu()-second.getJumsu();
			}
			
		};
		list.sort(comp);
		for (DTO temp : list) {
			System.out.println(temp);
		}
		sc.close();	

	}

}
