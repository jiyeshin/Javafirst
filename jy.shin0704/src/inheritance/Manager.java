package inheritance;

public class Manager extends Employee {// Employee클래스를 상속받은 Manager 클래스
	//Manager클래스는 num, name, task를 갖고 있는거.
	
	
	
	//이렇게 생성자를 직접 만들어서 상위 클래스의 생성자를 부르는 경우는
	//안드로이드에서 많이 발생.
	public Manager() {
		super(10);//이렇게 첫 번째 라인에 있어야 함.
	}
	
	private String task; //직책을 저장할 변수


	public String getTask() {
		return task;
	}
	
	//메소드원형: setTask(String)
	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		//super.toString()은 상위 클래스인 Employee의 toString을 호출함
		return super.toString()+" Manager [task=" + task + "]";
	}

}
