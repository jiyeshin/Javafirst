package polymorphis_game;

public class Main {

	public static void main(String[] args) {
		// 3개의 클래스의 공격하는 메소드를 호출해보자
		
		Starcraft star = new Terran();
		star.attack();
		
		star=new Zerg();
		star.attack();
		
		star=new Protoss();
		star.attack();
	}
}
