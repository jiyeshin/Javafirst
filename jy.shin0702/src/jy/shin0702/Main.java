package jy.shin0702;

class Person {
	
////멤버 변수(instance variable)	
		//아래는 클래스 안에 static없이 만들어지 변수로, instance변수라고 함.
		//이 변수들은 객체가 만들어질 떄 각 객체마다 별도로 메모리를 할당 받음 -> main메소드에서 설명
		int num; 
		String name; 
		String phone_num;
		
////정적 변수(static variable)		
		static String schoolName;
////Final이 붙은 변수: 변경 못함, 아래처럼 이용함.
		static int x=10;
		static final int TEN=x;
		
		
		}



public class Main {
	//c:\>java main <-main 메소드 호출

	////클래스와 인스턴스 생성
		public static void main(String[] args) { 
			//args: 매게변수의 배열 <-일을 할 때 줘야하는 변수, arguments
			// Person이라는 클래스의 인스턴스를 생성
			Person ins = new Person();
			//인스턴스 이름을 출력하면 toString()이라는 메소드의 결과가 호출
			//보통은 클래스 이름과 해시코드 등등이 출력
			System.out.println(ins);
		
		
////지역변수(Local variable)
			//i는 for(제어문)안에서 만들어졌기 떄문에 밭에서는 사용못함
			for(int i=0;i<3;i=i+1) {
				System.out.println("Hello java");
			}
			//System.out.println(i);
			
			//지역변수는 반드시 초기화 해서 사용해야 함
			int k;
			//System.out.println(k);

////맴버변수(instance variable) - 객체별로 별도로 소유하는 변수?
			Person person1=new Person();
			Person person2=new Person();
			System.out.println("person1 "+person1.num);
			System.out.println("person2 "+person2.num);
			//위 답은 같아서 차이를 알기 어려우니..
			person1.num=1;
			System.out.println("person1 "+person1.num);
			System.out.println("person2 "+person2.num);
			//결과: person1만 값이 변함. 즉, 변수가 객체별로 따로라는 이야기.

////정적변수(static variable)
			//person1.schoolName="블라블라 학교"; //<-객체 이름으로 호출
			Person.schoolName ="블라블라 학교";//<-클래스 이름으로 호출하는 경우도 가능
			System.out.println("person1 "+person1.schoolName);
			System.out.println("person2 "+person2.schoolName);
			//static은 하나만 만들어서 공유하기 때문에 누군가가 변경하면 다른 모두에 영향을 미침.
			
			
			
			
	}

}
