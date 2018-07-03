package method;

public class Main {

	public static void main(String[] args) {
//아래처럼 반복되는 경우는 유지 보수를 위해 반복문을 사용
		/*System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");

		for(int i=0;i<3;i++) {
			System.out.println("Hello Java");
		}
		
		System.out.println("Hello C++");
		
		for(int i=0;i<3;i++) {
			System.out.println("Hello Java");
		}
		*/
		
		////Task 클래스의 인스턴스 생성
		Task ins=new Task();
		//메소드 호출
		ins.helloJavaThreeTimesPrintln();
		System.out.println("Hello C++");
		ins.helloJavaThreeTimesPrintln();
		
		//new Task().sumOneToOneHundred(); //메소드 한번만 쓸 때 호출하는 방법 
		//정석은 생성 후 호출
		//Task a=new Task(); a.sumOneToOneHundred();
		int result = new Task().sumOneToOneHundred(100); //100까지의 합을 구하라
		result=result+1;
		System.out.println(result);
		
		boolean r=new Task().isLogin("root", "1234");
		if(r==true) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("없는 아이디거나 비밀번호가 틀렸습니다.");
		}
		
	}

}
