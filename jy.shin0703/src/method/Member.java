package method;

public class Member {
	private String username;
	private String email;
	private String password;
	private String phone;
	private String birth;
	private int age;
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String arg) {
		birth=arg;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("이름: "+username+"\t"+"이메일: "+email+"\t"+
				"비번: "+password+"\t"+"전번: "+phone+"\t"+"생년월일: "+birth+
				"\t"+"나이: "+age);
	}
	
	
////인스턴스 변수들을 출력해주는 메소드
	//클래스 안에서 클래스에 만들어진 변수를 사용할 때는
	//인스턴스나 클래스 이름을 기재하지 않음.member1.username이 아니라 그냥 username만 쓴다
	
	@Override
	public String toString() {
		return "Member [username=" + username + ", email=" + email + ", password=" 
	+ password + ", phone=" + phone
				+ ", birth=" + birth + ", age=" + age + "]";
	}

	
	
////가변 매개 변수
	//static 메소드: 클래스 이름으로 호출할 수 있는 메소드
	//매개변수에 ...이 있으면 매개변수 개수에 상관없이 대입 가능. 아래는 정수를 몇개를 줘도 상관 없다는거
	public static int sum(int ...ar) {
		int total=0;
		int len=ar.length; //heap에 있는 데이터를 stack에 저장. 자주 사용하기 때문에 heap에 있으면 효율 떨어짐
		for(int i=0;i<len;i=i+1) {
			total=total+ar[i];
		}
		return total;
	}
	
	
	

	
	
}
