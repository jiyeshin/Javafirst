package constructor;

public class Main {

	public static void main(String[] args) {
	
		Practice practice1=new Practice(); //Practice 클래스의 인스턴스 생성
		//practice1.setName("noname");
		System.out.println(practice1.getName()); //생성자에서 초기값을 갖고 있는 경우
		
		
		Practice practice2=new Practice();
		//practice2.setName("noname");
		System.out.println(practice2.getName());
		
		Practice practice3=new Practice("Park ");
		//practice2.setName("noname");
		System.out.println(practice3.getName());
		
		
		
		String str="Hello World";
		int r=str.lastIndexOf("llok");
		System.out.println(r);
		
		r=str.length();
		System.out.println(r);
		
		practice3.display();
		
		
		
	}
}
