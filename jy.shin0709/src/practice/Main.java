package practice;

public class Main {

	public static void main(String[] args) {
		SetnameTest snt=new SetnameTest();
		snt.name="cat";
		//snt.setName("cat");
		System.out.println(snt.name);

		int a=4;
		int b=8;
		
		int sum2=snt.sum(a, b);
		System.out.println(sum2);
		
		String insa=snt.say();
		System.out.println(insa);
		
		
	}

}
