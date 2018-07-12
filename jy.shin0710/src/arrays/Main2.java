package arrays;

import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		//인스턴스 배열 만들기
		Book [] books=new Book[5];
		
		//인스턴스 생성
		books[0]=new Book();
		
		//값 채우기
		books[0].setTitle("삼국지");
		books[0].setAuthor("나작가");
		books[0].setPubdate("2017-08-11");
		books[0].setPrice(20000);
		
		books[1]=new Book();
		books[1].setTitle("이것이 자바다");
		books[1].setAuthor("김한빛");
		books[1].setPubdate("2018-01-01");
		books[1].setPrice(60000);
		
		books[2]=new Book();
		books[2].setTitle("나에게 다정한 하루");
		books[2].setAuthor("고건태");
		books[2].setPubdate("1995-01-10");
		books[2].setPrice(50000);
		
		books[3]=new Book();
		books[3].setTitle("아보카도");
		books[3].setAuthor("김상균");
		books[3].setPubdate("1995-05-23");
		books[3].setPrice(40000);
		 
		books[4]=new Book();
		books[4].setTitle("무민과 유쾌한 친구들");
		books[4].setAuthor("김동한");
		books[4].setPubdate("1998-07-03");
		books[4].setPrice(45000);
		
		
		
		//배열의 데이터를 정렬
		//기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 함
		//자바에서 크기 비교를 하는 메소드는 comparable인터페이스의 compare메소드임.
		//직접 만든 클래스의 경우는 클래스에 comparable인터페이스를 implements하던가,
		//comparator인터페이스를 implements한 인스턴스를 같이 대입해야 함.
		Arrays.sort(books);
		
		//comparator인터페이스를 implements한 인스턴스 만들기
	/*	Comparator<Book> comp=new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//데이터 형 변환
				Book first=(Book)o1;
				Book second=(Book)o2;
				return first.getPrice()-second.getPrice();
				
			}
			
		};
		
		Arrays.sort(books,comp);
		*/
		
		//Comparator 인터페이스를 implements한 인스턴스 만들기
	/*	Comparator <Book> comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Book first=(Book)o1;
				Book second=(Book)o2;
				
				//pubdate로 비교
				return first.getPubdate().compareTo(second.getPubdate());
			}
		};
		
		Arrays.sort(books, comparator);*/
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			//비교할 Comparator 변수 선언
			Comparator <Book> comparator=null;
			System.out.print("0:종료 1:제목오름차순 2:제목내림차순");
			int menu=sc.nextInt();
			if(menu==0) {
				break;
			}
			else if(menu==1) {
				comparator=new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						Book book1=(Book)o1;
						Book book2=(Book)o2;
						return book1.getAuthor().compareTo(book2.getAuthor());
					}
				};
			}
			else if(menu==2) {
				comparator=new Comparator() {
					@Override
					public int compare(Object o1, Object o2) {
						Book book1=(Book)o1;
						Book book2=(Book)o2;
						return book2.getAuthor().compareTo(book1.getAuthor());
						//숫자는 .compareTo 대신에 - 로
					}
				};
			}
			Arrays.sort(books, comparator);
			//배열의 데이터를 전부 출력
			for(Book temp:books) {
				System.out.println(temp);
			}
			System.out.println("============================");
		} sc.close();
		
	}

}
