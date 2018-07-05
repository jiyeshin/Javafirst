package innerclass;

public class Outer {
	// 일반 inner class : 클래스 안에 존재하는 클래스
	static class Inner {
static int n;
////static inner class
//내부 클래스 안에 static 멤버가 있으면 일반 inner class는 에러를 발생시킴
//이 떄는 class앞에 static을붙여 주어야함
	}
	
	////local inner class
	//메소드 안에 만드는 클래스
	//메소드가 호출되서 실행될 떄 만들어졌다가 없어지는 클래스
	//클래스가 메소드를 호출할 때만 존재하기 때문에 메모리 효율을 높일 수도 있음.
	public void sample() {
		class Inner{
			
		}
	}
}

/*class Foreign {
	Inner inner = new Inner(); // 내부 클래스를 이렇게 밖에서 부르면 안된다는거
}*/

