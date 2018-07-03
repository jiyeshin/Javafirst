package method;

public class Task {

		//Hello Java를 3번 출력하는 메소드
		public void helloJavaThreeTimesPrintln() {

			for(int i=0;i<3;i++) {
				System.out.println("Hello Java");
			}
		

	}
		
		//1부터 100까지의 합을 리턴해주는 메소드
		public int sumOneToOneHundred(int n) { //1부터 n까지의 합을 구하는 메소드가 됨.

			int sum=0;
			for(int i=1;i<n+1;i++) {
				sum+=i;
			}
			return sum;
		}
		
		//로그인 처리 메소드
		public boolean isLogin(String id, String pw) {
			boolean result=false;
			if(id.equals("root")&&pw.equals("1234")) {
				result=true;
			}
			return result;
		}
		
		
		//회원탈퇴 메소드
		public boolean isDeleteMember(String id, String pw) {
			boolean result=false;
			if(id.equals("root")&&pw.equals("1234")) {
				result=true;
			}
			return result;
		}
}
